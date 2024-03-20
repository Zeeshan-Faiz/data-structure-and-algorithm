public class ConvertBSTtoDLL {

    /*
     * You are given the root of a Binary Search Tree, convert the tree into a doubly linked list.
    */

    DLLNode head;
    DLLNode tail;

    public TreeNode convert(TreeNode root) {
        if (root == null) {
            return null;
        }

        helper(root);
        return root;
    }

    private void helper(TreeNode node) {
        
        if(node == null) 
          return;
        
        //inorder traversal
        helper(node.left);

        DLLNode newNode = new DLLNode(node.val);
    
        if(head == null) {
          head = newNode;
          tail = newNode;
        } 
        else {
          tail.next = newNode;
          newNode.prev = tail;
          tail = newNode;
        }
        helper(node.right);
    }
}

class DLLNode {
    int val;
    DLLNode prev;
    DLLNode next;

    public DLLNode(int val) {
        this.val = val;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}