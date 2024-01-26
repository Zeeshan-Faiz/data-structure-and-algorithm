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

    void printLinkedList(Node head){

        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

}

public class AddElementAtEnd {
    
    /*
     * Write a program to addd element at the end of Linked List.
    */


}
