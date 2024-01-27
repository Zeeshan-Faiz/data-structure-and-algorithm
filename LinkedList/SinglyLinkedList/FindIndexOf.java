package SinglyLinkedList;

/*
 * Write a program to find the index of a specific element in a given linked list.
*/

class Node6{
    
    int data;
    Node6 next;

    public Node6(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList6{

    Node6 head;

    void printLinkedList(){

        Node6 curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    void addAtEnd(int e){

        Node6 temp = new Node6(e);
        //if there's no element in the linked list
        if(head == null)
            head = temp;
        
        //if there are elements present in the linked list
        else{
            Node6 curr = head;
            while(curr.next != null)
                curr = curr.next;
            
            curr.next = temp;
        }
    }

    int findIndexOf(int e){

        Node6 curr = head;
        int count = 0;
        while(curr != null){
            if(curr.data == e)
                return count;
            
            curr = curr.next;
            count++;
        }
        return -1;
    }
}

public class FindIndexOf {

    public static void main(String[] args) {
    
        LinkedList6 ll = new LinkedList6();
        int[] ar = {1,2,3,4,5,6,7,8,9,10};

        for(int element : ar){
            ll.addAtEnd(element);
        }

        ll.printLinkedList();

        System.out.println(ll.findIndexOf(5));


    }
    

}
