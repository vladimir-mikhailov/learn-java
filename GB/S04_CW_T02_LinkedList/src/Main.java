import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            list.add("" + i);
        }
        System.out.println(list);

        while (scanner.hasNextLine() && !(s = scanner.nextLine()).equals("q")) {
            if (s.equalsIgnoreCase("q")) break;
            String[] split = s.split("~");
            if (split[0].equalsIgnoreCase("print")){
                System.out.println(list.remove(Integer.parseInt(split[1])));
            } else {
                list.add(Integer.parseInt(split[1]), split[0]);
            }
            System.out.println(list);
        }

    }
}
