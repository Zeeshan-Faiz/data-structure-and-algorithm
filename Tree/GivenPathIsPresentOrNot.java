public class GivenPathIsPresentOrNot {
    
    /*
    Given the root of a Binary tree and an array containing the path values. Find whether the given
    path is present in the tree or not.
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