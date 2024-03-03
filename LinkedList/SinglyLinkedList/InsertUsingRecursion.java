package SinglyLinkedList;

public class InsertUsingRecursion {
    
    /*
     * Insert a node in a singly list using recursion.
    */

    private Node head;
    private int size;

    public InsertUsingRecursion() {
        this.size = 0;
    }

    public InsertUsingRecursion(Node head, int size) {
        this.head = head;
        this.size = size;
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

        node.next = insertRec(val, index-1, node.next);
        return node;
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
}
