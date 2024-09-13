public class ContentManagerImpl implements ContentManager {
    private final StorageBackend storageBackend;

    public ContentManagerImpl(StorageBackend storageBackend) {
        this.storageBackend = storageBackend;
    }

    @Override
    public void addContent(String id, String content) {
        storageBackend.save(id, content);
    }

    @Override
    public String getContent(String id) {
        return storageBackend.load(id);
    }

    @Override
    public void updateContent(String id, String newContent) {
        storageBackend.update(id, newContent);
    }

    @Override
    public void deleteContent(String id) {
        storageBackend.delete(id);
    }
}
