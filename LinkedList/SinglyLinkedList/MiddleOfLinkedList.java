package SinglyLinkedList;

public class MiddleOfLinkedList {

    /*
    Given the head of a singly linked list, return the middle node of the linked list.
    If there are two middle nodes, return the second middle node.

    Example 1:
    Input: head = [1,2,3,4,5]
    Output: [3,4,5]
    Explanation: The middle node of the list is node 3.

    Example 2:
    Input: head = [1,2,3,4,5,6]
    Output: [4,5,6]
    Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
    */
    
    //Approach : Let two pointers start from head of the given linkedlist. One of the pointer's speed is 2x times
    //more than the other pointer such that when the first pointer reaches the end of LL, the other slower pointer
    //will reach exactly half of the linkedlist, hence return the node of this slow pointer.

    public ListNode middleNode(ListNode head) {
        
        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
}
