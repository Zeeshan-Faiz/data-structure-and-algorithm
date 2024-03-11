import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class SymmetricTree {
    
    /*
    Given the root of a binary tree, check whether it is a mirror of 
    itself (i.e., symmetric around its center).

    Example 1:
    Input: root = [1,2,2,3,4,4,3]
    Output: true

    Example 2:
    Input: root = [1,2,2,null,3,null,3]
    Output: false
    */

    public boolean isSymmetric(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while(!queue.isEmpty()) {
            
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();

            if(left == null && right == null) 
                continue;
            
            if(left == null || right == null) 
                return false;

            if (left.val != right.val) 
                return false;

            //add in the queue smartly in order to compare successive nodes in the next level
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
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