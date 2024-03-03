package SinglyLinkedList;

public class FindLengthOfCycle {

    /*
    Given the head of a linkedlist, determine the length of the cycle.
    */

    //Approach : We'll use fast and slow pointers and once both of these pointers meet we'll stop fast pointer
    //let the slow pointer to traverse, keeping the count of nodes until it reached back to fast pointer.

    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // calculate the length
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }
    
}
