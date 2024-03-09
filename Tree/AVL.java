public class AVL {

    /*
    The AVL Tree, named after its inventors Adelson-Velsky and Landis, is a self-balancing binary search tree (BST).
    A self-balancing tree is a binary search tree that balances the height after insertion and deletion according to 
    some balancing rules.
    */


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
    
}
