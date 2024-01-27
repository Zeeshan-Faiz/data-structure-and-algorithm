package DoublyLinkedList;

/*
 * Regarding the disadvantages of a singly linked list:
 * i)Unidirectional Traversal: In a singly linked list, you can only traverse the list in one direction – from the 
 * head (beginning) to the tail (end). If you need to traverse backward, you would need to start from the head 
 * and traverse the list again, which can be inefficient.
 * ii)Extra Memory: Singly linked lists require less memory compared to doubly linked lists since they have only 
 * one reference field. The absence of a "previous" pointer reduces the memory overhead.
 * iii)Complex Deletion: Deleting a node from the middle of a singly linked list requires traversing from the head 
 * to find the previous node. This operation can be less efficient compared to a doubly linked list where you 
 * already have a reference to the previous node.
 * 
 * A doubly linked list is a type of linked list where each node contains a data element and two pointers or 
 * references. These pointers are used to link the node to both its previous and next nodes in the sequence. 
 * In a doubly linked list, each node has a "previous" pointer pointing to the node before it and a "next" 
 * pointer pointing to the node after it.
*/

//creating a blue print of a Node for doubly linked list.
class DNode{
    
    int data;
    DNode next;
    DNode prev;

    public DNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList{

    DNode head;
    DNode tail;

    void printDoublyLinkedList(){

        DNode curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

}

public class IntroToDoublyLinkedList {

    public static void main(String[] args) {
        
        //Adding data to a node
        

        DoublyLinkedList ll = new DoublyLinkedList();
        
        ll.printDoublyLinkedList();


    }
    
}
