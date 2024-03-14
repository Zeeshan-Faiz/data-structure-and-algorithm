import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserializeBinaryTree {
    
    /*
    Serialization is the process of converting a data structure or object into a sequence of bits so that it can be 
    stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in 
    the same or another computer environment.

    Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your 
    serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be 
    serialized to a string and this string can be deserialized to the original tree structure.

    Example 1:
    Input: root = [1,2,3,null,null,4,5]
    Output: [1,2,3,null,null,4,5]
    */

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        
        if (root == null) 
            return "#";
        
        return root.val + "," + serialize(root.left) + "," + serialize(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        
        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));
        return helper(queue);
    }

    private TreeNode helper(Queue<String> queue) {
        
        String s = queue.poll();

        if (s.equals("#")) 
            return null;
        
        TreeNode root = new TreeNode(Integer.valueOf(s));
        root.left = helper(queue);
        root.right = helper(queue);
        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}