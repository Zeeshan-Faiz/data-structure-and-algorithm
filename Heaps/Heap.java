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

    //find parent of any element
    private int parent(int index) {
        return (index - 1) / 2;
    }

    //find left element of the given index
    private int left(int index) {
        return index * 2 + 1;
    }

    //find right element of the given index
    private int right(int index) {
        return index * 2 + 2;
    }

}