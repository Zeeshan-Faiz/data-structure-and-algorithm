package SinglyLinkedList;

public class InsertUsingRecursion {

    /*
     * Insert a node in a singly list using recursion.
     */

    private Node head;
    private Node tail;
    private int size;

    public InsertUsingRecursion() {
        this.size = 0;
    }

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index - 1, node.next);
        return node;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }


    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        
        InsertUsingRecursion ll = new InsertUsingRecursion();
        ll.insertLast(1);
        ll.insertLast(5);
        ll.insertLast(15);
        ll.insertLast(20);
        ll.display();

        ll.insertRec(25, 2);
        ll.display();
    }
}