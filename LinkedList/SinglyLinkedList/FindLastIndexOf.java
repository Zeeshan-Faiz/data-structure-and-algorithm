package SinglyLinkedList;

/*
 * Write a program to find the last index of a given element in a linked list.
*/

class Node8{
    
    int data;
    Node8 next;

    public Node8(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList8{

    Node8 head;

    void printLinkedList(){

        Node8 curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    void addAtEnd(int e){

        Node8 temp = new Node8(e);
        //if there's no element in the linked list
        if(head == null)
            head = temp;
        
        //if there are elements present in the linked list
        else{
            Node8 curr = head;
            while(curr.next != null)
                curr = curr.next;
            
            curr.next = temp;
        }
    }

    int lastIndexOf(int e){

        Node8 curr = head;
        int count = 0;
        int index = -1;
        while(curr != null){
            if(curr.data == e)
                index = count;
            
            curr = curr.next;
            count++;
        }
        return index;
    }
}

public class FindLastIndexOf {

    public static void main(String[] args) {
    
        LinkedList8 ll = new LinkedList8();
        int[] ar = {1,2,3,4,5,5,5,8,9,10};

        for(int element : ar){
            ll.addAtEnd(element);
        }

        ll.printLinkedList();
        System.out.println(ll.lastIndexOf(5));

    }
}
