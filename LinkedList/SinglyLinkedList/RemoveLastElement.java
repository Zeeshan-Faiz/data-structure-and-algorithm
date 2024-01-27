package SinglyLinkedList;
/*
 * Write a program to remove the last element from the linked list.
*/

class Node4{
    
    int data;
    Node4 next;

    public Node4(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList4{

    Node4 head;

    void printLinkedList(){

        Node4 curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    void addAtEnd(int e){

        Node4 temp = new Node4(e);
        //if there's no element in the linked list
        if(head == null)
            head = temp;
        
        //if there are elements present in the linked list
        else{
            Node4 curr = head;
            while(curr.next != null)
                curr = curr.next;
            
            curr.next = temp;
        }
    }

    void addFirst(int e){

        Node4 temp = new Node4(e);
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
                Node4 temp = new Node4(e);
                int count = 0;
                Node4 curr = head;
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

    void removeLast(){

        //for empty list
        if(head == null)
            return;
        //for one element present in the list
        if(head.next == null)
            head = null;
        //for multiple elements present
        if(head.next != null){
            Node4 curr = head;
            while(curr.next.next != null){
                curr = curr.next;
            }
            curr.next = null;
        }
    }
}

public class RemoveLastElement {
    
    public static void main(String[] args) {
        
        LinkedList4 ll = new LinkedList4();
        
        ll.addAtEnd(10);
        ll.addAtEnd(20);
        ll.addAtEnd(30);
        ll.addAtEnd(40);

        ll.printLinkedList();

        ll.removeLast();
        ll.printLinkedList();

    }
}
