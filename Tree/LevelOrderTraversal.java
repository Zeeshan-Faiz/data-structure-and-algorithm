import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    
    /*
    (Q102 Leetcode Question(Meduim))
    Given the root of a binary tree, return the level order traversal of its nodes' values. 
    (i.e., from left to right, level by level).

    Example 1:
    Input: root = [3,9,20,null,null,15,7]
    Output: [[3],[9,20],[15,7]]

    Example 2:
    Input: root = [1]
    Output: [[1]]

    Example 3:
    Input: root = []
    Output: []
    */

    public List<List<Integer>> levelOrder(TreeNode root) {
         
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) 
        return result;

        //Use queue to add nodes levelwise
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            int levelSize = queue.size();
            List<Integer> currentLevelResult = new ArrayList<>(levelSize);
            for (int i=0; i < levelSize; i++) {

                //take out node from queue and add it in the list
                TreeNode currentNode = queue.poll();
                currentLevelResult.add(currentNode.val);
                
                //adding the children of current node in the queue
                if (currentNode.left != null) 
                queue.offer(currentNode.left);
                
                if (currentNode.right != null) 
                queue.offer(currentNode.right);
            }
            result.add(currentLevelResult);
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