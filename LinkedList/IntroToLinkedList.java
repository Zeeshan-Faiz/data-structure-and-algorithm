/*
 * Disadvantages of arrays:
 * i)Needs contagious memory allocation.
 * ii)Insertion and Deletion is difficult in an array.
 * 
 * A linked list is a linear data structure in which elements are stored in nodes, and each node points to the
 * next node in the sequence. Unlike arrays, linked lists do not require contiguous memory locations, and their 
 * size can change dynamically during runtime. The fundamental building block of a linked list is a node, 
 * which consists of two fields: a data field to store the element, and a reference (or link) field to point to 
 * the next node in the sequence.
*/

//creating a blue print of a Node for linked list.
class Node{
    
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

//A linkedList class to store all the operations related to linkedlist and it's element.
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

//To create 4 different nodes containing values (10,20,30,40) and then printing them.
public class IntroToLinkedList {
    
    public static void main(String[] args) {
        
        //Adding data to each node
        Node p1 = new Node(10);
        Node p2 = new Node(20);
        Node p3 = new Node(30);
        Node p4 = new Node(40);

        //linking each node with it's next node
        Node head = p1;
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;

        LinkedList ll = new LinkedList();
        ll.printLinkedList(head);
    }
}
