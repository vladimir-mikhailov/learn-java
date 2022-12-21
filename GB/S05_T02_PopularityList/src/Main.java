// 2. Пусть дан список сотрудников. Написать программу, которая найдет и выведет повторяющиеся имена
// с количеством повторений. Отсортировать по убыванию популярности.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String rawList = """
                Иван Иванов
                Светлана Петрова
                Кристина Белова
                Анна Мусина
                Анна Крутова
                Иван Юрин
                Петр Лыков
                Павел Чернов
                Петр Чернышов
                Мария Федорова
                Марина Светлова
                Мария Савина
                Мария Рыкова
                Марина Лугова
                Анна Владимирова
                Иван Мечников
                Петр Петин
                Иван Ежов
                """;

        ArrayList<HashMap<String, String>> list = new ArrayList<>();
        Scanner scanner = new Scanner(rawList);
        while (scanner.hasNextLine()) {
            HashMap<String, String> user = new HashMap<>();
            String[] userData = scanner.nextLine().split(" ");
            user.put("name", userData[0]);
            user.put("lastName", userData[1]);
            list.add(user);
        }

        HashMap<String, Integer> names = new HashMap<>();
        for (HashMap<String, String> user : list) {
            String name = user.get("name");
            if (names.containsKey(name)) {
                names.put(name, names.get(name) + 1);
            } else {
                names.put(user.get("name"), 1);
            }
        }

        Object[] sorted = names.entrySet().stream().sorted(Comparator.comparingInt(e -> -e.getValue())).toArray();
        for (Object row: sorted) {
            System.out.println(row);
        }
    }
}
