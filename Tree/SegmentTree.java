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
    
}
