// Семинар 2.
// Задание 4. К калькулятору из предыдущего дз добавить логирование.

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws IOException {
        Logger logger = MyLogger.getLogger("GeekBrains/src/SimpleCalcWithLogger.txt");
        Scanner input = new Scanner(System.in);

        System.out.print("Введите число А: ");
        float a = input.nextFloat();

        System.out.print("Введите число Б: ");
        float b = input.nextFloat();

        System.out.print("Введите операцию '/', '*', '+' или '-': ");
        char op = input.next().charAt(0);

        StringBuilder msg = new StringBuilder();
        float res = calc(a, b, op);
        msg
                .append(a).append(" ")
                .append(op).append(" ")
                .append(b).append(" ")
                .append("=").append(" ")
                .append(String.format("%.2f", res));

        logger.info(msg.toString());
        System.out.printf("Результат: %.2f\n", res);
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
        }
        return 0;
    }
}
