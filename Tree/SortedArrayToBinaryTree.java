import javax.swing.tree.TreeNode;

public class SortedArrayToBinaryTree {

    /*
     * Given an integer array nums where the elements are sorted in ascending order,
     * convert it to a height-balancedbinary search tree.
    
     * Example 1:
     * Input: nums = [-10,-3,0,5,9]
     * Output: [0,-3,9,-10,null,5]
     * Explanation: [0,-10,5,null,-3,null,9] is also accepted.
     
     * Example 2:
     * Input: nums = [1,3]
     * Output: [3,1]
     * Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
     */

    TreeNode root;

    public TreeNode sortedArrayToBST(int[] nums) {
        populatedSorted(nums, 0, nums.length);
        return root;
    }

    private void populatedSorted(int[] nums, int start, int end) {
        
        if (start >= end) 
            return;

        int mid = (start + end) / 2;

        insert(nums[mid]);

        //add in left part
        populatedSorted(nums, start, mid);

        //add in right part
        populatedSorted(nums, mid + 1, end);
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    public TreeNode insert(int value, TreeNode node) {
        
        //if node is null then add a node at that particular position either right or left
        if (node == null) {
            node = new TreeNode(value);
            return node;
        }

        if (value < node.val) 
            node.left = insert(value, node.left);

        if (value > node.val) 
            node.right = insert(value, node.right);
        
        //if there's already a node present towards left or right return the same node without modifying it
        return node;
    }

}