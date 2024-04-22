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

        phoneBook.addContact("Анна", "123456");
        phoneBook.addContact("Анна", "654321");
        phoneBook.addContact("Вова", "987456");
        phoneBook.addContact("Миша", "654987");
        phoneBook.addContact("Миша", "876534");

        System.out.println("Контакты Анны: " + phoneBook.getContactCount("Анна"));
        System.out.println("Контакты Вовы: " + phoneBook.getContactCount("Вова"));
        System.out.println("Контакты Мишы: " + phoneBook.getContactCount("Миша"));

        for (Map.Entry<String, List<String>> entry : phoneBook.phoneBook.entrySet()) {
            System.out.printf("%s: %s\n", entry.getKey(), entry.getValue());
        }
    }
}
