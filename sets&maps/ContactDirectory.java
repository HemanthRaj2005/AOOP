import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ContactDirectory {
    private final Map<String, Contact> contactsByName;
    private final Map<String, Contact> contactsByPhoneNumber;

    public ContactDirectory(boolean useTreeMap) {
        // Use TreeMap for ordered keys, HashMap for unordered
        contactsByName = useTreeMap ? new TreeMap<>() : new HashMap<>();
        contactsByPhoneNumber = useTreeMap ? new TreeMap<>() : new HashMap<>();
    }

    public void addContact(Contact contact) {
        contactsByName.put(contact.getName(), contact);
        contactsByPhoneNumber.put(contact.getPhoneNumber(), contact);
    }

    public Contact getContactByName(String name) {
        return contactsByName.get(name);
    }

    public Contact getContactByPhoneNumber(String phoneNumber) {
        return contactsByPhoneNumber.get(phoneNumber);
    }

    public void removeContactByName(String name) {
        Contact contact = contactsByName.remove(name);
        if (contact != null) {
            contactsByPhoneNumber.remove(contact.getPhoneNumber());
        }
    }

    public void removeContactByPhoneNumber(String phoneNumber) {
        Contact contact = contactsByPhoneNumber.remove(phoneNumber);
        if (contact != null) {
            contactsByName.remove(contact.getName());
        }
    }

    public void printContacts() {
        for (Contact contact : contactsByName.values()) {
            System.out.println(contact);
        }
    }
}
