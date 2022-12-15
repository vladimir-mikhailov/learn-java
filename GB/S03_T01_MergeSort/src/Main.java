//1. Реализовать алгоритм сортировки слиянием

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        int listSize = 67;
        // Максимальный размер куска массива, который можно отсортировать быстрой сортировкой.
        int quickSortableSize = 5;
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println(list);

        for (int ch = quickSortableSize; ch < listSize; ch *= 2) {
            ArrayList<Integer> buffer = new ArrayList<>(listSize);
            for (int l = 0; l < listSize - 1; l += ch * 2) {
                ArrayList<Integer> left, right;

                if (ch >= listSize - 1 - l) {
                    left = new ArrayList<>(list.subList(l, listSize));
                    if (ch == quickSortableSize) {
                        left.sort(null);
                    }
                    buffer.addAll(left);
                } else {
                    left = new ArrayList<>(list.subList(l, l + ch));
                    right = new ArrayList<>(list.subList(l + ch, Math.min(l + ch * 2, listSize)));
                    if (ch == quickSortableSize) {
                        left.sort(null);
                        right.sort(null);
                    }
                    buffer.addAll(mergeSort(left, right));
                }
            }
            list = new ArrayList<>(buffer);
        }
        System.out.println(list);

    }

    public static ArrayList<Integer> mergeSort(ArrayList<Integer> left, ArrayList<Integer> right) {
        ArrayList<Integer> res = new ArrayList<>(left.size() + right.size());
        int i = 0, j = 0;
        while (i < left.size() && j < right.size()) {
            res.add(left.get(i) <= right.get(j) ? left.get(i++) : right.get(j++));
            if (i == left.size()) res.addAll(new ArrayList<>(right.subList(j, right.size())));
            if (j == right.size()) res.addAll(new ArrayList<>(left.subList(i, left.size())));
        }
        return res;
    }
}