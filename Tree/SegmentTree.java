public class SegmentTree {

    /*
    
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
