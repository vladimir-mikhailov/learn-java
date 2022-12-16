// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) list.add((int) (Math.random() * 100));
        System.out.println(list);

        int max = list.get(0), min = list.get(0), sum = list.get(0);
        for (int num : list) {
            if (num > max) max = num;
            if (num < min) min = num;
            sum += num;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + sum / list.size());
    }
}