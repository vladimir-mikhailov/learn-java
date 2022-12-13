//2. Вывести все простые числа от 1 до 1000

package Seminar01;

public class Prime {
    public static void main(String[] args) {
        getPrimes(1000);
    }

    public static void getPrimes(int num) {
        int i = 0;
        while (i <= num) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
                if (j == i - 1) {
                    System.out.println(i);
                }
            }
            i++;
        }
    }
}
