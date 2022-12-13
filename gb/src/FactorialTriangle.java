// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n),
// n! (произведение чисел от 1 до n)

public class FactorialTriangle {
    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(triangle(4));
    }

    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return factorial(num - 1) * num;
    }

    public static int triangle(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return triangle(num - 1) + num;
    }

}
