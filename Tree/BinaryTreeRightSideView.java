import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    
    /*
    Given the root of a binary tree, imagine yourself standing on the right side of it,
    return the values of the nodes you can see ordered from top to bottom.

    Example 1:
    Input: root = [1,2,3,null,5,null,4]
    Output: [1,3,4]

    Example 2:
    Input: root = [1,null,3]
    Output: [1,3]

    Example 3:
    Input: root = []
    Output: []
    */

    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> result = new ArrayList<>();

        if (root == null) 
            return result;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i=0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();

                //add last node of each level
                if (i == levelSize - 1) 
                result.add(currentNode.val);
                
                
                if (currentNode.left != null) 
                queue.offer(currentNode.left);
                
                if (currentNode.right != null) 
                queue.offer(currentNode.right);
                
            }
        }
        return result;
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