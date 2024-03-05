public class CustomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {

        // this takes care of it being full
        if (this.isFull()) {
            // double the array size
            int[] temp = new int[data.length * 2];

            // copy all previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {

        if (isEmpty())
            throw new Exception("Cannot pop from an empty stack!!");

        return data[ptr--];
    }

    public int peek() throws Exception {

        if (isEmpty())
            throw new Exception("Cannot peek from an empty stack!!");

        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1; // ptr is at last index
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public static void main(String[] args) throws Exception {

        CustomStack stack = new CustomStack();
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(8);

        System.out.println(stack.pop());
    }
}