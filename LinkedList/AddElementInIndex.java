/*
 * Write a program to add element at the given index in the linked list.
*/

class Node3{
    
    int data;
    Node3 next;

    public Node3(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList3{

    Node3 head;

    void printLinkedList(){

        Node3 curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    void addAtEnd(int e){

        Node3 temp = new Node3(e);
        //if there's no element in the linked list
        if(head == null)
            head = temp;
        
        //if there are elements present in the linked list
        else{
            Node3 curr = head;
            while(curr.next != null)
                curr = curr.next;
            
            curr.next = temp;
        }
    }

    void addFirst(int e){

        Node3 temp = new Node3(e);
        if(head == null)
            head = temp;
        else{
            temp.next = head;
            head = temp;
        }
    }

    void addAtIndex(int index, int e){

        try{
            if(index == 0)
                addFirst(e);
            else{
                Node3 temp = new Node3(e);
                int count = 0;
                Node3 curr = head;
                while(count < index-1){
                    curr = curr.next;
                    count++;
                }
                temp.next = curr.next;
                curr.next = temp;
            }
        }
        //If given index is greater than the current Linked List
        catch(NullPointerException ex){
            throw new IndexOutOfBoundsException();
        }
    }
}

public class AddElementInIndex {
    
    public static void main(String[] args) {
        
        LinkedList3 ll = new LinkedList3();
        
        ll.addAtEnd(10);
        ll.addAtEnd(20);
        ll.addAtEnd(30);
        ll.addAtEnd(40);

        ll.printLinkedList();

        ll.addAtIndex(2, 25);
        ll.printLinkedList();

    }
}
