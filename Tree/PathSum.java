public class PathSum {
    
    /*
    Given the root of a binary tree and an integer targetSum, return true if the tree has a 
    root-to-leaf path such that adding up all the values along the path equals targetSum.

    Example 1:
    Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
    Output: true
    Explanation: The root-to-leaf path with the target sum is shown.

    Example 2:
    Input: root = [1,2,3], targetSum = 5
    Output: false
    Explanation: There two root-to-leaf paths in the tree:
    (1 --> 2): The sum is 3.
    (1 --> 3): The sum is 4.
    There is no root-to-leaf path with sum = 5.
    */

    public boolean hasPathSum(TreeNode root, int sum) {
        
        if (root == null) 
            return false;
        
        //if we got the total sum by the time we reach the leaf node, return true
        if (root.val == sum && root.left == null && root.right == null) 
            return true;
    
        //otherwise traverse in left and right side of the tree
        return hasPathSum(root.left, sum-root.val) || 
                    hasPathSum(root.right, sum-root.val);
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