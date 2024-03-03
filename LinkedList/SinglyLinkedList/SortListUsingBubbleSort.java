package SinglyLinkedList;

public class SortListUsingBubbleSort {

    /*
    /*
     * Given the head of a linked list, return the list after sorting it in ascending order.
    
     * Example 1:
     * Input: head = [4,2,1,3]
     * Output: [1,2,3,4]
    
     * Example 2:
     * Input: head = [-1,5,3,4,0]
     * Output: [-1,0,3,4,5]
    */

    private ListNode head;
    private ListNode tail;
    private int size;

    public SortListUsingBubbleSort() {
        this.size = 0;
    }

    //Approach : Using bubble Sort Recursively
    public void bubbleSort() {
        bubbleSort(size - 1, 0);
    }

    private void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            ListNode first = get(col);
            ListNode second = get(col + 1);

            if (first.val > second.val) {
                // swap
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    ListNode prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    ListNode prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, 0);
        }
    }

    public ListNode get(int index) {
        ListNode node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(){}

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    
}
