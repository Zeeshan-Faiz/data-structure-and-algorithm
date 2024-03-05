public class CircularQueue {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length; // ptr is at last index
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {

        if (this.isFull()) {
            // double the array size
            int[] temp = new int[data.length * 2];

            // copy all previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        
        if (isEmpty()) 
            throw new Exception("Queue is empty");

        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception {
        
        if (isEmpty()) 
            throw new Exception("Queue is empty");
        
        return data[front];
    }

    public void display() {
        
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }

    public static void main(String[] args) throws Exception {
        
        CircularQueue cQueue = new CircularQueue();
        cQueue.insert(4);
        cQueue.insert(8);
        cQueue.insert(12);
        cQueue.insert(16);
        cQueue.insert(20);

        cQueue.display();
        cQueue.remove();
        cQueue.display();
    }
}