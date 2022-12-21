// Перевести римские цифры в арабские

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(convertToArabic("MCXVIII"));
        System.out.println(convertToArabic("MMXXII"));
        System.out.println(convertToArabic("MMXIV"));
        System.out.println(convertToArabic("MMIX"));
    }

    public static int convertToArabic(String expression) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('M', 1000);
        romanMap.put('D', 500);
        romanMap.put('C', 100);
        romanMap.put('L', 50);
        romanMap.put('X', 10);
        romanMap.put('V', 5);
//        romanMap.put('I', 1);

        int res = 0;
        int iCount = 0;
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == 'I') {
                iCount++;
            } else if (romanMap.containsKey(ch)) {
                if (iCount != 0) {
                    if (ch == 'V' || ch == 'X') {
                        res += romanMap.get(ch) - iCount;
                        iCount = 0;
                    } else {
                        res += iCount;
                    }
                } else {
                    res += romanMap.get(ch);
                }
            }
        }
        if (iCount != 0) res += iCount;
        return res;
    }
}
