// Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 11; i++) list.add((int) (Math.random() * 100));
        System.out.print(list + " -> ");
        list.removeIf(num -> num % 2 == 0);
        System.out.print(list);
    }
}