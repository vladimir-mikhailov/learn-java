// Семинар 2.
// Задание 1. Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
// используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "GB/S02_T01_JsonToSql/JsonToSql.json";
        System.out.println(getSQL(fileName));
    }

    private static String getSQL(String fileName) throws IOException {
        FileReader f = null;
        try {
            f = new FileReader(fileName);

        } catch (FileNotFoundException e) {
            System.out.println("Нет такого файла.");
        }

        StringBuilder sql = new StringBuilder();
        if (f != null) {
            Gson gson = new Gson();
            TypeToken<Map<String, String>> mapType = new TypeToken<>() {
            };
            Map<String, String> studentMap = gson.fromJson(f, mapType);

            sql.append("SELECT * FROM students WHERE ");
            int counter = 0;
            for (Map.Entry<String, String> student : studentMap.entrySet()) {
                if (!Objects.equals(student.getValue(), "null")) {
                    if (counter > 0) {
                        sql.append(" AND ");
                    }
                    sql.append(student.getKey()).append(" = '").append(student.getValue()).append("'");
                    counter++;
                }
            }
            sql.append(';');
            f.close();
        }
        return sql.toString();
    }
}
