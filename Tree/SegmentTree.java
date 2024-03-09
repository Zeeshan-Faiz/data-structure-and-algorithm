public class SegmentTree {

    /*
    A Segment Tree is a data structure that stores information about array intervals as a tree. 
    This allows answering range queries over an array efficiently, while still being flexible enough to 
    allow quick modification of the array.
    */

    private static class Node {
        
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;
    
        public Node (int startInterval, int endInterval) {
          this.startInterval = startInterval;
          this.endInterval = endInterval;
        }
    }
    
    Node root;
    
    public SegmentTree(int[] arr) {
        // create a tree using this array
        this.root = constructTree(arr, 0, arr.length - 1);
    }

    private Node constructTree(int[] arr, int start, int end) {
        
        if(start == end) {
          // leaf node
          Node leaf = new Node(start, end);
          leaf.data = arr[start];
          return leaf;
        }
    
        // create new node with index you are at
        Node node = new Node(start, end);
        
        int mid = (start + end) / 2;
    
        node.left = this.constructTree(arr, start, mid);
        node.right = this.constructTree(arr, mid + 1, end);
    
        node.data = node.left.data + node.right.data;
        return node;
    }
    
    public void display() {
        display(this.root);
    }

    private void display(Node node) {
        
        String str = "";
    
        if(node.left != null) 
          str = str + "Interval=[" + node.left.startInterval + "-" + node.left.endInterval + "] and data: " + node.left.data + " => "; 
        
        else 
          str = str + "No left child";
    
        // for current node
        str = str + "Interval=[" + node.startInterval + "-" + node.endInterval + "] and data: " + node.data + " <= "; 
        
        if(node.right != null) 
          str = str + "Interval=[" + node.right.startInterval + "-" + node.right.endInterval + "] and data: " + node.right.data; 
        
        else 
          str = str + "No right child";

        System.out.println(str + '\n');
    
        // call recursion
        if(node.left != null) 
          display(node.left);
        
        if(node.right != null) 
          display(node.right);
    }
    
}