// Задание 3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен разности элементов
// двух входящих массивов в той же ячейке. Если длины массивов не равны,
// необходимо как-то оповестить пользователя.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S1_T3_Arrays {

    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(1,2,3);
        List<Integer> arr2 = Arrays.asList(1,2,3,4);

        try {
            System.out.println(getDifference(arr1, arr2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<Integer> getDifference(List<Integer> arr1, List<Integer> arr2) throws Exception {
        List<Integer> differenceArray = new ArrayList<>();

        if (arr1.size() != arr2.size()) {
            throw new Exception("Achtung! Array1 Size != Array2 Size");
        }

        for (int i = 0; i < arr1.size(); i++) {
            differenceArray.add(arr1.get(i) - arr2.get(i));
        }

        return differenceArray;
    }

}
