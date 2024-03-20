import java.util.HashSet;

public class TwoSumIV {

    /*
     * Given the root of a binary search tree and an integer k, return true if there
     * exist two elements in the BST such that their sum is equal to k, or false otherwise.
    
     * Example 1:
     * Input: root = [5,3,6,2,4,null,7], k = 9
     * Output: true

     * Example 2:
     * Input: root = [5,3,6,2,4,null,7], k = 28
     * Output: false
    */

    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        return helper(root, k, set);
    }

    private boolean helper(TreeNode node, int k, HashSet<Integer> set) {
        
        if (node == null) 
            return false;
        
        if (set.contains(k - node.val)) 
            return true;

        set.add(node.val);
        return helper(node.left, k, set) || helper(node.right, k, set);
    }

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}