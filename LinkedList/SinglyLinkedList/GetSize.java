package SinglyLinkedList;

/*
 * Write a program to print the number of elements present in the given linked list.
*/

class Node9{
    
    int data;
    Node9 next;

    public Node9(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList9{

    Node9 head;

    void printLinkedList(){

        Node9 curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    void addAtEnd(int e){

        Node9 temp = new Node9(e);
        //if there's no element in the linked list
        if(head == null)
            head = temp;
        
        //if there are elements present in the linked list
        else{
            Node9 curr = head;
            while(curr.next != null)
                curr = curr.next;
            
            curr.next = temp;
        }
    }

    int size(){

        Node9 curr = head;
        int count = 0;
        while(curr != null){
            curr = curr.next;
            count ++;
        }
        return count;
    }
}

public class GetSize {

    public static void main(String[] args) {
    
        LinkedList9 ll = new LinkedList9();
        int[] ar = {1,2,3,4,5,5,5,8,9,10};

        for(int element : ar){
            ll.addAtEnd(element);
        }

        ll.printLinkedList();
        System.out.println(ll.size());
    }
}
