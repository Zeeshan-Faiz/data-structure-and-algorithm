package SinglyLinkedList;

public class ReverseListUsingIteration {

    /*
     * (Q206 Leetcode Question(Easy))Given the head of a singly linked list, reverse the list, and return the reversed list.
     * 
     * Example 1:
     * Input: head = [1,2,3,4,5]
     * Output: [5,4,3,2,1]
     * 
     * Example 2:
     * Input: head = [1,2]
     * Output: [2,1]
    */

    //Take three pointers--> prev,present & next and then try reversing the list accordingly

    public ListNode reverseList(ListNode head) {
        
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;//change direction
            
            prev = present;
            present = next;
            if (next != null) 
                next = next.next;
        }
        return prev;
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