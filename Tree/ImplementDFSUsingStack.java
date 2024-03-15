import java.util.Stack;

public class ImplementDFSUsingStack {

    /*
     * Given the root of a binary tree, traverse the tree in DFS(preorder) and print
     * each nodes.
     */

    public void dfsStack(TreeNode node) {
        
        if (node == null) 
            return;
        
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {

            TreeNode removed = stack.pop();
            System.out.print(removed.val + " ");

            //as we are traversing via preorder we'll add right node in the stack first
            if (removed.right != null) 
                stack.push(removed.right);
            
            if (removed.left != null) 
                stack.push(removed.left);
        }
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