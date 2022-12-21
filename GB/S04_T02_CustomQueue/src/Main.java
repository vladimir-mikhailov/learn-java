// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
// Подобную задачу решали на семинаре. Здесь так же нужно создать класс, который будет реализовывать указанные методы.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue();

        System.out.print("Empty Array: ");
        System.out.println(Arrays.toString(myQueue.get()));
        System.out.println("Size: " + myQueue.size);

        System.out.println();
        System.out.println("Queued: 1-10 ");
        for (int i = 1; i < 11; i++) {
            myQueue.enqueue(i);
        }
        System.out.println(Arrays.toString(myQueue.get()));
        System.out.println("Size: " + myQueue.size);
        System.out.println("In memory: " + Arrays.toString(myQueue.arr));

        System.out.println();
        System.out.print("First: ");
        System.out.println(myQueue.first());
        System.out.println(Arrays.toString(myQueue.get()));
        System.out.println("Size: " + myQueue.size);

        System.out.println();
        System.out.print("Dequeued: ");
        System.out.println(myQueue.dequeue());
        System.out.println(Arrays.toString(myQueue.get()));
        System.out.println("Size: " + myQueue.size);
    }
}
