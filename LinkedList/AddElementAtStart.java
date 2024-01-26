/*
 * Write a program to add element at the start of linked list
*/

class Node{
    
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList{

    Node head;

    void printLinkedList(){

        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    
}

public class AddElementAtStart {
    
    public static void main(String[] args) {
        
        LinkedList ll = new LinkedList();
        
        ll.addAtEnd(10);
        ll.addAtEnd(20);
        ll.addAtEnd(30);
        ll.addAtEnd(40);

        ll.printLinkedList();

    }


}
