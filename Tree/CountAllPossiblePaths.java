public class CountAllPossiblePaths {
    
    /*
    Given the root of a binary tree and a targetSum, find and count all the possible paths that is equal to
    the given targetSum.
    */

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