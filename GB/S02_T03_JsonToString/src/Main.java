// Семинар 2.
// Задание 3. Дана json строка (можно сохранить в файл и читать из файла)
// [
//  {"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
//  {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
//  {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}
// ]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        String jsonFile = "GB/S02_T03_JsonToString/JsonToString.json";
        System.out.println(getReport(jsonFile));
    }

    private static String getReport(String fileName) throws IOException {
        FileReader f = null;
        try {
            f = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Нет такого файла.");
        }

        StringBuilder reportText = new StringBuilder();
        if (f != null) {
            Gson gson = new Gson();
            TypeToken<List<Map<String, String>>> mapType = new TypeToken<>() {
            };
            List<Map<String, String>> marksList = gson.fromJson(f, mapType);

            for (Map<String, String> mark : marksList) {
                reportText
                        .append("Студент ").append(mark.get("фамилия"))
                        .append(" получил ").append(mark.get("оценка"))
                        .append(" по предмету ").append(mark.get("предмет"))
                        .append(".\n");
            }

            f.close();
        }
        return reportText.toString();
    }
}
