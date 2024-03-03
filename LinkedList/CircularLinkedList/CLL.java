package CircularLinkedList;


public class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }



    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

}
