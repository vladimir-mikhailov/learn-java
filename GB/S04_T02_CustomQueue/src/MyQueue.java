public class MyQueue {
    public int size = 0;
    int[] arr = new int[10];

    public int[] get() {
        int[] res = new int[size];
        System.arraycopy(arr, 0, res, 0, size);
        return res;
    }

    public void enqueue(int el) {
        rebuildArray();
        arr[size++] = el;
    }

    public int dequeue() {
        int deleted = arr[0];
        int[] res = new int[arr.length];
        System.arraycopy(arr, 1, res, 0, --size);
        arr = res;
        return deleted;
    }

    public int first() {
        return arr[0];
    }

    private void rebuildArray() {
        if (arr.length / 2 < size) {
            int newSize = arr.length + arr.length / 2;
            int[] res = new int[newSize];
            System.arraycopy(arr, 0, res, 0, size);
            arr = res;
        }
    }

}
