import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        proceedList(new ArrayList<>());
        proceedList(new LinkedList<>());
    }

     static void proceedList(List<String> list) {
         long start = System.currentTimeMillis();
         for (int i = 0; i < 10000000; i++) {
             list.add("" + i);
         }
         long stop = System.currentTimeMillis();
         System.out.println("result: " + (stop - start));
    }
}
