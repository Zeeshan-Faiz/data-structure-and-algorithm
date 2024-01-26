/*
 * Write a program to add element at the given index in the linked list.
*/

class Node3{
    
    int data;
    Node next;

    public Node3(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList3{

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

public class AddElementInIndex {
    


}
