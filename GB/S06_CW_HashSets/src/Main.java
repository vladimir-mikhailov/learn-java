import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = getIntegerArr();
        System.out.println("Часть 1, Array:");
        System.out.println(Arrays.toString(arr));
        countUnique(arr);

        List<Integer> list = List.of(12, 1234, 4, 4, 5, 6 , 7, 23, 66, 3, 7, 87, 44, 23, 555, 65, 43, 32, 90);

        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        System.out.println();
        System.out.println("Часть 2, List:");
        System.out.println(list);

        System.out.println();
        System.out.println("hashSet:");
        proceed(hashSet, list);

        System.out.println();
        System.out.println("linkedHashSet:");
        proceed(linkedHashSet, list);

        System.out.println();
        System.out.println("treeSet:");
        proceed(treeSet, list);
    }

    private static int[] getIntegerArr() {
        int size = 100;
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            list[i] = (int) (Math.random() * (size + 1));
        }
        return list;
    }

    static void proceed(Set<Integer> set, List<Integer> list) {
        set.addAll(list);
        System.out.println(set);
    }

    static void countUnique(int[] arr) {

        Set<Integer> set = new HashSet<>();
        for (int j : arr) {
            set.add(j);
        }
        System.out.println("Set:");
        System.out.println(set);
        System.out.printf("Процент уникальных элементов: %.2f \n", (float) (set.size() * 100 / arr.length));
    }
}
