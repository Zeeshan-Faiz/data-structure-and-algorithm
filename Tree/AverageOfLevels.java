import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class AverageOfLevels {
    
    /*
    (Q637 Leetcode Question (Easy))
    Given the root of a binary tree, return the average value of the nodes on each level in the form of an array. 
    Answers within 10-5 of the actual answer will be accepted.

    Example 1:
    Input: root = [3,9,20,null,null,15,7]
    Output: [3.00000,14.50000,11.00000]
    Explanation: The average value of nodes on level 0 is 3, 
    on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].

    Example 2:
    Input: root = [3,9,20,15,7]
    Output: [3.00000,14.50000,11.00000]
    */

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();

        if (root == null) 
            return result;

        //Use queue to add nodes levelwise
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            int levelSize = queue.size();
            double averageLevel = 0;
            for (int i=0; i < levelSize; i++) {
                
                //take out node from queue and add it in the list
                TreeNode currentNode = queue.poll();
                averageLevel = averageLevel + currentNode.val; //find the sum of the nodes in that level

                if (currentNode.left != null) 
                queue.offer(currentNode.left);
                
                if (currentNode.right != null) 
                queue.offer(currentNode.right); 
            }
            averageLevel = averageLevel / levelSize; //calculate the average of that level and store in the list
            result.add(averageLevel);
        }
        return result;
    }
}