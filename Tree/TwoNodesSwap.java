public class TwoNodesSwap {

    /*
     * Given the root of a Binary Search Tree with two of it's nodes swapped, find
     * the swapped node and
     * restore the original tree.
     */

    TreeNode first;
    TreeNode second;
    TreeNode prev;

    public void helper(TreeNode root) {
        inOrderTraversal(root);

        // swap
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    private void inOrderTraversal(TreeNode node) {
        
        if (node == null) 
            return;

        inOrderTraversal(node.left);

        if (prev != null && prev.val > node.val) {
            if (first == null) {
                first = prev;
            }
            second = node;
        }
        prev = node;
        inOrderTraversal(node.right);
    }

    public void printTree(TreeNode node) {
        
        if (node == null)
            return;
    
        printTree(node.left);
        System.out.print(node.val + " ");
        printTree(node.right);
    }

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}