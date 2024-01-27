package SinglyLinkedList;

/*
 * Write a program to add mulitple elements from array to a linked list.
*/

class Node5{
    
    int data;
    Node5 next;

    public Node5(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList5{

    Node5 head;

    void printLinkedList(){

        Node5 curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    void addAtEnd(int e){

        Node5 temp = new Node5(e);
        //if there's no element in the linked list
        if(head == null)
            head = temp;
        
        //if there are elements present in the linked list
        else{
            Node5 curr = head;
            while(curr.next != null)
                curr = curr.next;
            
            curr.next = temp;
        }
    }
}

public class AddMultipleElements {

    public static void main(String[] args) {
    
    LinkedList5 ll = new LinkedList5();

    int[] ar = {1,2,3,4,5,6,7,8,9,10};

    for(int element : ar){
        ll.addAtEnd(element);
    }

    ll.printLinkedList();
    }
}
