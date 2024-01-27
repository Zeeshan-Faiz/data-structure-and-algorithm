package DoublyLinkedList;

/*
 * Wrtie a program to add elements to a doubly linked list.
*/

class DNode2{
    
    int data;
    DNode2 next;
    DNode2 prev;

    public DNode2(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList2{

    DNode2 head;
    DNode2 tail;

    void printDoublyLinkedList(){

        DNode2 curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    void add(int e){

        DNode2 temp = new DNode2(e);
        if(head == null){
            head = temp;
            tail = temp;
        }
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }
}

public class AddElements {

    public static void main(String[] args) {
       
        DoublyLinkedList2 ll = new DoublyLinkedList2();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        
        ll.printDoublyLinkedList();
        System.out.println(ll.head.data);
        System.out.println(ll.tail.data);
    } 
}
