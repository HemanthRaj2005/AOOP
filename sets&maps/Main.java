public class Main {
    public static void main(String[] args) {
        // Using Set for unique contacts
        ContactManager manager = new ContactManager(true); // Using TreeSet for ordered contacts
        manager.addContact(new Contact("Alice", "1234567890", "alice@example.com"));
        manager.addContact(new Contact("Bob", "0987654321", "bob@example.com"));
        manager.addContact(new Contact("Charlie", "1234509876", "charlie@example.com"));

        System.out.println("Contacts in Set:");
        manager.printContacts();

        // Using Map for key-value pair contacts
        ContactDirectory directory = new ContactDirectory(true); // Using TreeMap for ordered keys
        directory.addContact(new Contact("Alice", "1234567890", "alice@example.com"));
        directory.addContact(new Contact("Bob", "0987654321", "bob@example.com"));
        directory.addContact(new Contact("Charlie", "1234509876", "charlie@example.com"));

        System.out.println("\nContact by Name:");
        System.out.println(directory.getContactByName("Alice"));

        System.out.println("\nContact by Phone Number:");
        System.out.println(directory.getContactByPhoneNumber("0987654321"));
    }
}
