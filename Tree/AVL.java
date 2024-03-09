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
    
        if (value < node.value) 
          node.left = insert(value, node.left);
    
        if (value > node.value) 
          node.right = insert(value, node.right);
        
    
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        
        //check whether the newly aded node has made the tree unbalances
        return rotate(node);
    }

    private Node rotate(Node node) {

        //left heavy unbalanced
        if (height(node.left) - height(node.right) > 1) {
        
            //left-left case
            if(height(node.left.left) - height(node.left.right) > 0) 
                return rightRotate(node);
          
            //left-right case
            if(height(node.left.left) - height(node.left.right) < 0) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
    
        //right heavy unbalanced
        if (height(node.left) - height(node.right) < -1) {
          
            //right-right case
            if(height(node.right.left) - height(node.right.right) < 0) 
                return leftRotate(node);
            
            //right-left case
            if(height(node.right.left) - height(node.right.right) > 0) {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
    
        //If no condition is fulfilled then return the node without making any structure change
        return node;
      }
    
    public Node rightRotate(Node p) {
        
        Node c = p.left;
        Node t = c.right;
    
        c.right = p;
        p.left = t;
        
        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);
    
        return c;
    }
    
    public Node leftRotate(Node c) {
        
        Node p = c.right;
        Node t = p.left;
    
        p.left = c;
        c.right = t;
        
        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);
    
        return p;
    }
    
    
}
