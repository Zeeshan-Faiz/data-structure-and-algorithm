import java.util.ArrayList;

//minHeap
public class Heap<T extends Comparable<T>> {

    private ArrayList<T> list;

    public Heap() {
        list = new ArrayList<>();
    }

    // function to swap two elements
    private void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    // find parent of any element
    private int parent(int index) {
        return (index - 1) / 2;
    }

    // find left element of the given index
    private int left(int index) {
        return index * 2 + 1;
    }

    // find right element of the given index
    private int right(int index) {
        return index * 2 + 2;
    }

    // inserting an element at the last index and then place it in the correct order
    // according to it's value
    public void insert(T value) {
        list.add(value);
        upheap(list.size() - 1);
    }

    public int size(){
        return list.size();
    }

    private void upheap(int index) {

        // return when you reach the starting index/top of the tree
        if (index == 0)
            return;

        // compare parent with the inserted value and swap if parent is greater than the
        // current inserted value
        int p = parent(index);
        if (list.get(index).compareTo(list.get(p)) < 0) {
            swap(index, p);
            upheap(p);
        }
    }

    // removing an element from the top of the heap.
    public T remove() throws Exception {

        if (list.isEmpty()) {
            throw new Exception("Removing from an empty heap!");
        }

        // take the first element to be removed
        T temp = list.get(0);

        // now add the last element to the first index and traverse top to bottom to
        // place this current value to it's correct position
        T last = list.remove(list.size() - 1);
        if (!list.isEmpty()) {
            list.set(0, last);
            downheap(0);
        }
        return temp;
    }

    private void downheap(int index) {

        int min = index;
        // find left and right of the current index, compare it from both left and right
        // and place it accordingly
        int left = left(index);
        int right = right(index);

        if (left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min = left;
        }

        if (right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = right;
        }

        // if there are certain values smaller than the current value, just swap
        if (min != index) {
            swap(min, index);
            downheap(min);
        }
    }

    // heapSort - Remove all the elements from heap and add to a list
    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while (!list.isEmpty()) {
            data.add(this.remove());
        }
        return data;
    }

    public static void main(String[] args) throws Exception {
        
        Heap<Integer> minHeap = new Heap<>();

        minHeap.insert(34);
        minHeap.insert(45);
        minHeap.insert(22);
        minHeap.insert(89);
        minHeap.insert(76);

        //System.out.println(minHeap.remove());

        ArrayList<Integer> list = minHeap.heapSort();
        System.out.println(list);
    }
}