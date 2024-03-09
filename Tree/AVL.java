public class AVL {

    /*
    The AVL Tree, named after its inventors Adelson-Velsky and Landis, is a self-balancing binary search tree (BST).
    A self-balancing tree is a binary search tree that balances the height after insertion and deletion according to 
    some balancing rules.
    */

    public AVL(){

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

    public int height() {
        return height(root);
    }

    private int height(Node node) {
        
        if (node == null) 
          return -1;
        
        return node.height;
    }
      
    public void insert(int value) {
        root = insert(value, root);
    }
    
    private Node insert(int value, Node node) {
        
        if (node == null) {
          node = new Node(value);
          return node;
        }
    
        if (value < node.value) {
          node.left = insert(value, node.left);
        }
    
        if (value > node.value) {
          node.right = insert(value, node.right);
        }
    
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        
        //check whether the newly aded node has made the tree unbalances
        return rotate(node);
    }
    
    
}
