public class MyStack {
    int[] arr = new int[10];
    int size = 10;

    public int[] get() {
        return arr;
    }

    public int[] empty(){
        arr = new int[0];
        size = 0;
        return arr;
    }
    public int peek(){
        return arr[0];
    }
    public int pop(){
        int popped = arr[0];
        int[] temp = new int[arr.length - 1];
        System.arraycopy(arr, 1, temp, 0, arr.length - 1);
        size--;
        arr = temp;
        return popped;
    }
    public void push(int num){
        int[] temp = new int[arr.length + 1];
        temp[0] = num;
        System.arraycopy(arr, 0, temp, 1, arr.length);
        size++;
        arr = temp;
    }

}
