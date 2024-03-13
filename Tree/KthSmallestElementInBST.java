public class KthSmallestElementInBST {
    
    /*
    Given the root of a binary search tree, and an integer k, return the kth smallest value 
    (1-indexed) of all the values of the nodes in the tree.

    Example 1:
    Input: root = [3,1,4,null,2], k = 1
    Output: 1

    Example 2:
    Input: root = [5,3,6,2,4,null,null,1], k = 3
    Output: 3
    */

    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        return helper(root, k).val;
    }

    public TreeNode helper(TreeNode root, int k) {
        
        if (root == null) 
            return null;
    
        //In-order traversal
        TreeNode left = helper(root.left, k);

        if (left != null) //found an element which might be kth smallest but need to check in the below condition
            return left;

        count++;

        if(count == k) //found the kth smallest element in the left
            return root;

        return helper(root.right, k); //check in the right side of the tree if can't find in the left part
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