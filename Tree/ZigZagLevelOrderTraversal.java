import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class ZigZagLevelOrderTraversal {
    
    /*
    (Q103 Leetcode question(Medium))
    Given the root of a binary tree, return the zigzag level order traversal of its nodes' values.
    (i.e., from left to right, then right to left for the next level and alternate between).

    Example 1:
    Input: root = [3,9,20,null,null,15,7]
    Output: [[3],[20,9],[15,7]]

    Example 2:
    Input: root = [1]
    Output: [[1]]

    Example 3:
    Input: root = []
    Output: []
    */

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
        return result;

        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        boolean reverse = false;
        
        while (!deque.isEmpty()) {

            int levelSize = deque.size();
            List<Integer> currentLevelResult = new ArrayList<>(levelSize);
            for (int i=0; i < levelSize; i++) {

                if (!reverse) {
                    //add the nodes normall to the list
                    TreeNode currentNode = deque.pollFirst();
                    currentLevelResult.add(currentNode.val);
                    
                    if (currentNode.left != null) 
                        deque.addLast(currentNode.left);
                    
                    if (currentNode.right != null) 
                        deque.addLast(currentNode.right);
                    
                } 
                else {
                    //add the nodes in reverse order to the list
                    TreeNode currentNode = deque.pollLast();
                    currentLevelResult.add(currentNode.val);
                    
                    if (currentNode.right != null) 
                        deque.addFirst(currentNode.right);
                    
                    if (currentNode.left != null) 
                        deque.addFirst(currentNode.left);
                    
                }
            }
            reverse = !reverse;
            result.add(currentLevelResult);
            }
        return result;
    }
    
}