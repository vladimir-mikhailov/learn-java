import List.MyLinkedList;
public class Main {
    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        System.out.println(myList);

        myList.revert();
        System.out.println(myList);
    }
}

// Output:
// {1, 2, 3}
// {3, 2, 1}