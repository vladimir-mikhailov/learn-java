// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPaired("a+(d*3)"));
        System.out.println(isPaired("[a+(1*3)"));
        System.out.println(isPaired("[6+(3*3)]"));
        System.out.println(isPaired("{a}[+]{(d*3)}"));
        System.out.println(isPaired("<{a}+{(d*3)}>"));
        System.out.println(isPaired("{a+]}{(d*3)}"));
        System.out.println(isPaired("}])"));
    }

    public static boolean isPaired(String expression) {
        HashMap<Character, Character> bracesMap = new HashMap<>();
        bracesMap.put(')', '(');
        bracesMap.put('}', '{');
        bracesMap.put(']', '[');
        bracesMap.put('>', '<');

        Deque<Character> bracesStack = new ArrayDeque<>();
        for (int i = 0; i < expression.length(); i++) {
            Character ch = expression.charAt(i);
            if (bracesMap.containsValue(ch)) {
                bracesStack.addFirst(ch);
            } else if (bracesMap.containsKey(ch)) {
                if (bracesStack.peekFirst() == bracesMap.get(ch)) {
                    bracesStack.removeFirst();
                } else {
                    return false;
                }
            }
        }
        return bracesStack.peekFirst() == null;
    }
}
