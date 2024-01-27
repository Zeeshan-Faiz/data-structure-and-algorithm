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

class LinkedList7{

    Node7 head;

    void printLinkedList(){

        Node7 curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    void addAtEnd(int e){

        Node7 temp = new Node7(e);
        //if there's no element in the linked list
        if(head == null)
            head = temp;
        
        //if there are elements present in the linked list
        else{
            Node7 curr = head;
            while(curr.next != null)
                curr = curr.next;
            
            curr.next = temp;
        }
    }

    void removeFirst(){

        if(head == null)
            return;
        else if(head.next == null)
            head = null;
        else if(head.next != null){
            Node7 curr = head;
            head = head.next;
            curr.next = null;
        }
    }
}

public class RemoveFirstElement {

    public static void main(String[] args) {
    
        LinkedList7 ll = new LinkedList7();
        int[] ar = {1,2,3,4,5,6,7,8,9,10};

        for(int element : ar){
            ll.addAtEnd(element);
        }

        ll.printLinkedList();

        ll.removeFirst();
        ll.printLinkedList();

    }
    
}
