package SinglyLinkedList;

/*
 * Write a program to remove first element from a linked list.
*/

class Node7{
    
    int data;
    Node7 next;

    public Node7(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList6{

    Node7 head;

    void printLinkedList(){

        Node7 curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

public class RemoveFirstElement {
    
}
