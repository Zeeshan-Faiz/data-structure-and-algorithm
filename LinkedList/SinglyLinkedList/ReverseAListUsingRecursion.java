package SinglyLinkedList;

public class ReverseAListUsingRecursion {

    /*
     * Given the head of a singly linked list, reverse the list, and return the
     * reversed list.
     * 
     * Example 1:
     * Input: head = [1,2,3,4,5]
     * Output: [5,4,3,2,1]
     * 
     * Example 2:
     * Input: head = [1,2]
     * Output: [2,1]
     */

    /*
     * Approach : Firstly move forward until you reach the tail of the list, and
     * from there start coming back
     * while changing the direction of the list.
     */

    private Node head;
    private Node tail;
    private int size;

    public ReverseAListUsingRecursion() {
        this.size = 0;
    }

    public void reverse(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}