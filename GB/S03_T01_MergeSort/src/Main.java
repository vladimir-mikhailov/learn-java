//1. Реализовать алгоритм сортировки слиянием

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        int listSize = 67;
        // Максимальный размер куска массива, который можно отсортировать быстрой сортировкой.
        // Если установить "1", то будет только сортировка слиянием.
        int chunkSize = 1;

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < listSize; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println(list);

        for (int ch = chunkSize; ch < listSize; ch *= 2) {
            LinkedList<Integer> buffer = new LinkedList<>();
            for (int l = 0; l < listSize; l += ch * 2) {
                LinkedList<Integer> left, right;

                if (ch >= listSize - 1 - l) {
                    left = new LinkedList<>(list.subList(l, listSize));
                    if (ch == chunkSize && left.size() > 1) {
                        left.sort(null);
                    }
                    buffer.addAll(left);
                } else {
                    left = new LinkedList<>(list.subList(l, l + ch));
                    right = new LinkedList<>(list.subList(l + ch, Math.min(l + ch * 2, listSize)));
                    if (ch == chunkSize) {
                        if (left.size() > 1) left.sort(null);
                        if (right.size() > 1) right.sort(null);
                    }
                    buffer.addAll(mergeSort(left, right));
                }
            }
            list = new LinkedList<>(buffer);
        }
        System.out.println(list);

    }

    public static LinkedList<Integer> mergeSort(LinkedList<Integer> left, LinkedList<Integer> right) {
        LinkedList<Integer> res = new LinkedList<>();
        int i = 0, j = 0;
        while (i < left.size() && j < right.size()) {
            res.add(left.get(i) <= right.get(j) ? left.get(i++) : right.get(j++));
            if (i == left.size()) res.addAll(new LinkedList<>(right.subList(j, right.size())));
            if (j == right.size()) res.addAll(new LinkedList<>(left.subList(i, left.size())));
        }
        return res;
    }
}
