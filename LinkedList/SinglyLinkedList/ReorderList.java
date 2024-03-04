package SinglyLinkedList;

public class ReorderList {

    /*
     * You are given the head of a singly linked-list. The list can be represented as:
     * L0 → L1 → … → Ln - 1 → Ln
    
     * Reorder the list to be on the following form:
     * L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
     * You may not modify the values in the list's nodes. Only nodes themselves may
     * be changed.
     
     * Example 1:
     * Input: head = [1,2,3,4]
     * Output: [1,4,2,3]
     
     * Example 2:
     * Input: head = [1,2,3,4,5]
     * Output: [1,5,2,4,3]
    */

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode mid = middleNode(head);

        ListNode hs = reverseList(mid);
        ListNode hf = head;

        // rearrange
        while (hf != null && hs != null) {
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }

        // next of tail to null
        if (hf != null) {
            hf.next = null;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
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