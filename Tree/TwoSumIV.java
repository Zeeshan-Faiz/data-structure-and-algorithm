public class TwoSumIV {
    
    /*
    Given the root of a binary search tree and an integer k, return true if there exist two elements in the BST such that their sum is equal to k, or false otherwise.   
    
    Example 1:
    Input: root = [5,3,6,2,4,null,7], k = 9
    Output: true

    Example 2:
    Input: root = [5,3,6,2,4,null,7], k = 28
    Output: false
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