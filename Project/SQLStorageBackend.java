import java.util.HashMap;
import java.util.Map;

public class SQLStorageBackend implements StorageBackend {
    private final Map<String, String> sqlDatabase = new HashMap<>();

    @Override
    public void save(String id, String content) {
        sqlDatabase.put(id, content);
    }

    @Override
    public String load(String id) {
        return sqlDatabase.get(id);
    }

    @Override
    public void update(String id, String newContent) {
        sqlDatabase.put(id, newContent);
    }

    @Override
    public void delete(String id) {
        sqlDatabase.remove(id);
    }
}
