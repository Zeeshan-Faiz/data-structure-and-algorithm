public class BinarySearchTree {

    /*
    A Binary Search Tree is a tree in which every node has a value that is greater than or equal to the node values in the left sub-tree, 
    and less than or equal to the node values in the right sub-tree.
    */

    public BinarySearchTree() {
    }

    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        
        //if node is null then add a node at that particular position either right or left
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.value)
            node.left = insert(value, node.left);
        
        if (value > node.value) 
            node.right = insert(value, node.right);

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        //if there's already a node present towards left or right return the same node without modifying it
        return node;
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public void populatedSorted(int[] nums) {
        populatedSorted(nums, 0, nums.length);
    }

    //If we have sorted numbers to be inserted in BST then the tree can be skewed which is not good
    //in order to tackle this we'll devide the array from middle and start inserting into the tree accordingly
    private void populatedSorted(int[] nums, int start, int end) {
        
        if (start >= end) 
            return;
        
        int mid = (start + end) / 2;

        this.insert(nums[mid]);

        //add in left hand
        populatedSorted(nums, start, mid);

        //add in right hand
        populatedSorted(nums, mid + 1, end);
    }

    public boolean balanced() {
        return balanced(root);
    }

    //to check whether the tree is balanced or not
    private boolean balanced(Node node) {
        
        if (node == null) 
            return true;
        
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display() {
        display(this.root, "Root Node: ");
    }

    private void display(Node node, String details) {
        
        if (node == null) 
            return;
        
        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }

    public static void main(String[] args) {
        
        BinarySearchTree tree = new BinarySearchTree();
        int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
        tree.populate(nums);
        tree.display();
    }
}