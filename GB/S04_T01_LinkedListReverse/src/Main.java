// Дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        System.out.println("Source:   " + integers);
        System.out.println("Reversed: " + reverse(integers));
    }

    public static LinkedList<Integer> reverse(LinkedList<Integer> list) {
        LinkedList<Integer> temp = new LinkedList<>(list);
        LinkedList<Integer> res = new LinkedList<>();
        int size = temp.size();
        for (int i = 0; i < size; i++) {
            res.add(temp.pollLast());
        }
        return res;
    }
}
