// 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PhoneBook myPhoneBook = new PhoneBook();

        myPhoneBook.addUser("Ivan", "Ivanov");
        myPhoneBook.addUser("Feofan", "Ignatov");
        myPhoneBook.addUser("Vasily", "Pupkin");

        myPhoneBook.addPhone("+79991111111", 1);
        myPhoneBook.addPhone("+79992222222", 2);
        myPhoneBook.addPhone("+79993333333", 1);

        for (ArrayList<String> user : myPhoneBook.getAll()) {
            System.out.println(user);
        }
    }
}
