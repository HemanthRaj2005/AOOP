import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ContactManager {
    private final Set<Contact> contactSet;

    public ContactManager(boolean useTreeSet) {
        contactSet = useTreeSet ? new TreeSet<>((c1, c2) -> c1.getName().compareTo(c2.getName())) : new HashSet<>();
    }

    public boolean addContact(Contact contact) {
        return contactSet.add(contact);
    }

    public boolean removeContact(Contact contact) {
        return contactSet.remove(contact); 
    }

    public boolean contactExists(Contact contact) {
        return contactSet.contains(contact); 
    }

    public void printContacts() {
        for (Contact contact : contactSet) {
            System.out.println(contact);
        }
    }
}
