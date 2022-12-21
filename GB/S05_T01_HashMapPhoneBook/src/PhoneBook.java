import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    HashMap<Integer, HashMap<String, String>> users = new HashMap<>();
    HashMap<String, Integer> phones = new HashMap<>();
    int lastUserId = 0;

    public void addUser(String name, String lastName) {
        HashMap<String, String> user = new HashMap<>();
        user.put("name", name);
        user.put("lastName", lastName);
        this.users.put(getNextId(), user);
    }

    private int getNextId() {
        return ++lastUserId;
    }

    public void addPhone(String phone, int userId) {
        this.phones.put(phone, userId);
    }

    public ArrayList<ArrayList<String>> getAll() {
        ArrayList<ArrayList<String>> phoneBook = new ArrayList<>();
        for (Map.Entry<Integer, HashMap<String, String>> user : this.users.entrySet()) {
            ArrayList<String> userData = new ArrayList<>();
            userData.add(String.valueOf(user.getKey()));
            userData.add(user.getValue().get("name"));
            userData.add(user.getValue().get("lastName"));

            for (Map.Entry<String, Integer> phone: phones.entrySet()) {
                if (phone.getValue().equals(user.getKey())) {
                    userData.add(phone.getKey());
                }
            }

            phoneBook.add(userData);
        }
        return phoneBook;
    }
}
