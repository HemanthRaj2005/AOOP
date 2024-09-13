public interface ContentManager {
    void addContent(String id, String content);
    String getContent(String id);
    void updateContent(String id, String newContent);
    void deleteContent(String id);
}
