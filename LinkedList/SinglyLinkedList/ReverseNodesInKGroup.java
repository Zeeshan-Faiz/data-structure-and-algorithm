package SinglyLinkedList;

public class ReverseNodesInKGroup {

    /*
     * Given the head of a linked list, reverse the nodes of the list k at a time,
     * and return the modified list.
     * k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes
     * is not a multiple of k then left-out nodes, in the end, should remain as it is.
     
     * You may not alter the values in the list's nodes, only nodes themselves may
     * be changed.
    
     * Example 1:
     * Input: head = [1,2,3,4,5], k = 2
     * Output: [2,1,4,3,5]
     
     * Example 2:
     * Input: head = [1,2,3,4,5], k = 3
     * Output: [3,2,1,4,5]
     */

    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1 || head == null) {
            return head;
        }

        ListNode prev = null;
        ListNode current = head;

        int remaininglength = listLength(head);

        while (remaininglength >= k) {

            ListNode last = prev;
            ListNode newEnd = current;

            ListNode next = current.next;

            for (int i = 0; (current != null) && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                next = (next != null) ? next.next : next;
            }

            if (last == null) {
                head = prev;
            } else {
                last.next = prev;
            }

            newEnd.next = current;
            prev = newEnd;

            remaininglength = remaininglength - k;
        }
        return head;
    }

    // finding the length of the List
    public int listLength(ListNode head) {
        if (head == null) {
            return 0;
        }

        ListNode temp = head;
        int length = 0;

        while (temp != null) {
            length += 1;
            temp = temp.next;
        }
        return length;
    }

}
