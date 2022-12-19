import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        System.out.println(Arrays.toString(stack.get()));
        System.out.println("Size: " + stack.size);

        System.out.println();
        System.out.println(Arrays.toString(stack.empty()));
        System.out.println("Size: " + stack.size);

        System.out.println();
        for (int i = 0; i < 6; i++) {
            stack.push(i);
        }
        System.out.println(Arrays.toString(stack.get()));
        System.out.println("Size: " + stack.size);

        System.out.println();
        System.out.println(stack.peek());
        System.out.println(Arrays.toString(stack.get()));
        System.out.println("Size: " + stack.size);

        System.out.println();
        System.out.println(stack.pop());
        System.out.println(Arrays.toString(stack.get()));
        System.out.println("Size: " + stack.size);
    }
}
