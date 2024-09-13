public class Main {
    public static void main(String[] args) {
        StorageBackend sqlBackend = new SQLStorageBackend();
        StorageBackend noSqlBackend = new NoSQLStorageBackend();

        ContentManager sqlContentManager = new ContentManagerImpl(sqlBackend);
        ContentManager noSqlContentManager = new ContentManagerImpl(noSqlBackend);

        System.out.println("Using SQL Backend:");
        sqlContentManager.addContent("1", "SQL Job Posting: Java Developer");
        System.out.println("Content ID 1: " + sqlContentManager.getContent("1"));

        sqlContentManager.updateContent("1", "SQL Job Posting: Senior Java Developer");
        System.out.println("Updated Content ID 1: " + sqlContentManager.getContent("1"));

        sqlContentManager.deleteContent("1");
        System.out.println("Deleted Content ID 1: " + sqlContentManager.getContent("1"));

        System.out.println("\nUsing NoSQL Backend:");
        noSqlContentManager.addContent("1", "NoSQL Job Posting: Python Developer");
        System.out.println("Content ID 1: " + noSqlContentManager.getContent("1"));

        noSqlContentManager.updateContent("1", "NoSQL Job Posting: Senior Python Developer");
        System.out.println("Updated Content ID 1: " + noSqlContentManager.getContent("1"));

        noSqlContentManager.deleteContent("1");
        System.out.println("Deleted Content ID 1: " + noSqlContentManager.getContent("1"));
    }
}
