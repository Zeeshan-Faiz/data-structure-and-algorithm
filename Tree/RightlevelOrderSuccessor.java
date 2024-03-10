import java.util.LinkedList;
import java.util.Queue;

public class RightlevelOrderSuccessor {

    /*
     * Given the root of a Binary tree and a key value find the level order right successor.

     * Example 1:
     * Input: root = [3,9,20,15,7], key = 9
     * Output: 20
    */

    public TreeNode findSuccessor(TreeNode root, int key) {

        if (root == null)
            return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            TreeNode currentNode = queue.poll();
            if (currentNode.left != null)
                queue.offer(currentNode.left);

            if (currentNode.right != null)
                queue.offer(currentNode.right);

            //check whether the current node is equal to the given key
            if (currentNode.val == key)
                break;
        }
        //return the right node of the current node stored in the queue
        return queue.peek();
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