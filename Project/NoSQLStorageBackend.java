import java.util.HashMap;
import java.util.Map;

public class NoSQLStorageBackend implements StorageBackend {
    private final Map<String, String> noSqlDatabase = new HashMap<>();

    @Override
    public void save(String id, String content) {
        noSqlDatabase.put(id, content);
    }

    @Override
    public String load(String id) {
        return noSqlDatabase.get(id);
    }

    @Override
    public void update(String id, String newContent) {
        noSqlDatabase.put(id, newContent);
    }

    @Override
    public void delete(String id) {
        noSqlDatabase.remove(id);
    }
}
