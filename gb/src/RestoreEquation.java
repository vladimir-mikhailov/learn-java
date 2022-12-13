// например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно
// решение или сообщить, что его нет.

import java.util.Scanner;

public class RestoreEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите уравнение вида \"2? + ?5 = 69\": ");
        String eq = input.nextLine();

        if (eq.contains("=")) {
            String[] parts = eq.split("[+=]");
            String left = parts[0].strip();
            String right = parts[1].strip();
            String result = parts[2].strip();

            if (eq.contains("?")) {
                String sourceEq = "";
                for (int l = 0; l < 10; l++) {
                    int temp_left = Integer.parseInt(left.replace("?", String.valueOf(l)));
                    for (int r = 0; r < 10; r++) {
                        int temp_right = Integer.parseInt(right.replace("?", String.valueOf(r)));
                        if (temp_left + temp_right == Integer.parseInt(result)) {
                            sourceEq = "Исходное уравнение: " + temp_left + " + " + temp_right + " = " + result;
                            System.out.print(sourceEq);
                            break;
                        }
                    }
                    if (l == 9 && sourceEq.equals("")) {
                        System.out.println("Решений не существует");
                    }
                }
            } else {
                System.out.println("В строке " + eq + " нет символов \"?\"");
            }
        } else {
            System.out.println("В строке " + eq + " нет символов \"=\" или \"+\"");
        }
    }
}
