// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
// Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
// повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования.
// (Например, add - egg изоморфны)
// буква может не меняться, а остаться такой же. (Например, note - code)
// Пример 1:
// Input: s = "foo", t = "bar"
// Output: false
// Пример 2:
// Input: s = "paper", t = "title"
// Output: true

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("add", "egg"));
        System.out.println(isIsomorphic("super", "duper"));
        System.out.println(isIsomorphic("spear", "gear"));
        System.out.println(isIsomorphic("appear", "upper"));

    }

    public static boolean isIsomorphic(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length()) return false;

        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < firstWord.length(); i++) {
            if (map.containsKey(firstWord.charAt(i))) {
                if (map.get(firstWord.charAt(i)) != secondWord.charAt(i)) {
                    return false;
                }
            } else {
                map.put(firstWord.charAt(i), secondWord.charAt(i));
            }
        }
        return true;
    }
}
