import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class RightlevelOrderSuccessor {
    
    /*
    Given the root of a Binary tree and a key value find the level order right successor.

    Example 1:
    Input: root = [3,9,20,15,7], key = 9
    Output: 20
    */

     public TreeNode findSuccessor(TreeNode root, int key){
        
        if (root == null) 
        return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
                TreeNode currentNode = queue.poll();
                if (currentNode.left != null) {
                queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                queue.offer(currentNode.right);
                }
                if (currentNode.val = key) {
                break;
            }
        }
        return queue.peek(); 
    }

    

}