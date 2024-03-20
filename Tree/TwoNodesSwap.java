public class TwoNodesSwap {
    
    /*
    Given the root of a Binary Search Tree with two of it's nodes swapped, find the swapped node and
    restore the original tree.
    */

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