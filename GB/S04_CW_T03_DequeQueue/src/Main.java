import java.util.*;

public class Main {
    public static void main(String[] args) {

        String s;
        Scanner scanner = new Scanner(System.in);
        Deque<String> deque = new ArrayDeque<>();
        Queue<String> queue = new LinkedList<>();

        while (scanner.hasNextLine() && !(s = scanner.nextLine()).equals("q")) {
            switch (s) {
                case ("print") -> {
                }
                case ("revert") -> {
                    System.out.println("Deque removed: " + deque.removeFirst());
                    System.out.println("Queue removed: " + queue.poll());
                }
                default -> {
                    deque.addFirst(s);
                    queue.add(s);
                }
            }
            System.out.println("Deque: " + deque);
            System.out.println("Queue: " + queue);
        }
        scanner.close();
    }
}
