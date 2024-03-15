import org.w3c.dom.Node;

public class GivenPathIsPresentOrNot {
    
    /*
    Given the root of a Binary tree and an array containing the path values. Find whether the given
    path is present in the tree or not.
    */

     boolean findPath(TreeNode node, int[] arr) {
        
        if (node == null) 
            return arr.length == 0;
    
        return helper(node, arr, 0);
    }

    public class TreeNode {
        
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}