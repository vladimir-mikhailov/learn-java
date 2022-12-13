// 3. Реализовать простой калькулятор

import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите число А: ");
        float a = input.nextFloat();

        System.out.print("Введите число Б: ");
        float b = input.nextFloat();

        System.out.print("Введите операцию '/', '*', '+' или '-': ");
        char op = input.next().charAt(0);

        System.out.printf("Результат: %.1f", calc(a, b, op));

    }

    public static float calc(float a, float b, char operation) {
        switch (operation) {
            case '/' -> {
                return a / b;
            }
            case '*' -> {
                return a * b;
            }
            case '+' -> {
                return a + b;
            }
            case '-' -> {
                return a - b;
            }
            default -> {
                return 0;
            }
        }
    }
}
