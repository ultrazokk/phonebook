import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBook = new HashMap<>();

    public void addContact(String name, String phone) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new ArrayList<>());
        }

        phoneBook.get(name).add(phone);
    }

    public List<String> getContacts(String name) {
        return phoneBook.getOrDefault(name, Collections.emptyList());
    }

    public int getContactCount(String name) {
        return getContacts(name).size();
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
    }


}
