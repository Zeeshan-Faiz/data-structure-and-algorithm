package SinglyLinkedList;
/*
    * Write a program to add element at the end of Linked List.
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

    void addAtEnd(int e){

        Node temp = new Node(e);
        //if there's no element in the linked list
        if(head == null)
            head = temp;
        
        //if there are elements present in the linked list
        else{
            Node curr = head;
            while(curr.next != null)
                curr = curr.next;
            
            curr.next = temp;
        }
    }
}

public class AddElementAtEnd {

    public static void main(String[] args) {
        
        LinkedList ll = new LinkedList();
        
        ll.addAtEnd(10);
        ll.addAtEnd(20);
        ll.addAtEnd(30);
        ll.addAtEnd(40);

        ll.printLinkedList();

    }
}
