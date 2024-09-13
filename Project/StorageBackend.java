public interface StorageBackend {
    void save(String id, String content);
    String load(String id);
    void update(String id, String newContent);
    void delete(String id);
}
