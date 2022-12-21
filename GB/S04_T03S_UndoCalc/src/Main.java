// 3. К калькулятору добавить возможность отмены последней операции.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printMenu();

        Scanner scanner = new Scanner(System.in);
        String s;
        while (scanner.hasNext() && (!(s = scanner.next()).equalsIgnoreCase("q"))) {
            if (s.equals("u")) {
                Calculator.undo();
            }
            float prevRes = Calculator.getLastResult();
            System.out.println();
            if (prevRes != 0) {
                Calculator.setA(prevRes);
                System.out.println("Число А (предыдущий результат): " + prevRes);
            } else {
                System.out.print("Введите число А: ");
                Calculator.setA(scanner.nextFloat());
            }

            System.out.print("Введите число Б: ");
            Calculator.setB(scanner.nextFloat());

            System.out.print("Введите операцию '/', '*', '+' или '-': ");
            Calculator.setOperation(scanner.next());

            System.out.printf("Результат: %.1f", Calculator.calc());
            System.out.println();
            printMenu();

        }
        scanner.close();

    }

    private static void printMenu() {
        System.out.print("""
                \nДля нового вычисления введите любой символ.
                Для отмены предыдущего вычисления – U.
                Для выхода – Q.
                                
                Ваш выбор:\s""");
    }

}
