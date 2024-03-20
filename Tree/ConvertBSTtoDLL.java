public class ConvertBSTtoDLL {
    
    /*
    You are given the root of a Binary Search Tree, convert the tree into a doubly linked list.
    */
}

class DLLNode {
    int val;
    DLLNode prev;
    DLLNode next;
  
    public DLLNode (int val) {
      this.val = val;
    }
  }
  
  class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
  
    public TreeNode (int val) {
      this.val = val;
    }
  }