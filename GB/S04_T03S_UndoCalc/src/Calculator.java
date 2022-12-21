import java.util.ArrayDeque;
import java.util.Deque;

public class Calculator {
    static float a;
    static float b;
    static String operation;
    static Deque<Float> history = new ArrayDeque<>();

    public static void setA(float num) {
        a = num;
    }

    public static void setB(float num) {
        b = num;
    }

    public static void setOperation(String op) {
        operation = op;
    }

    public static float calc() {
        float res;
        switch (operation) {
            case "/" -> res = a / b;
            case "*" -> res = a * b;
            case "+" -> res = a + b;
            case "-" -> res = a - b;
            default -> res = 0;
        }
        history.addFirst(res);
        return res;
    }

    public static void undo(){
        history.pollFirst();
    }

    public static float getLastResult(){
        return history.peekFirst() != null ? history.peekFirst() : 0;
    }
}
