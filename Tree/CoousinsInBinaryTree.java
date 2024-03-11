import javax.swing.tree.TreeNode;

public class CoousinsInBinaryTree {
    
    /*
    Given the root of a binary tree with unique values and the values of two different nodes of the tree x and y, 
    return true if the nodes corresponding to the values x and y in the tree are cousins, or false otherwise.

    NOTE: Two nodes of a binary tree are cousins if they have the same depth with different parents.

    Example 1:
    Input: root = [1,2,3,4], x = 4, y = 3
    Output: false

    Example 2:
    Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
    Output: true
    */

    public boolean isCousins(TreeNode root, int x, int y) {
        
        TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);

        return (
        (level(root, xx, 0) == level(root, yy, 0)) && (!isSibling(root, xx, yy))
        );
    }

    TreeNode findNode(TreeNode node, int x) {
        
        if (node == null) 
            return null;
        
        if (node.val == x) 
            return node;
        
        //find the node in left of the tree
        TreeNode n = findNode(node.left, x);
        if (n != null)
            return n;
        
        //node not found in left part try to find in the right side of tree
        return findNode(node.right, x);
    }

    boolean isSibling (TreeNode node, TreeNode x, TreeNode y) {
        
        if (node == null) 
            return false;
    
        return (
          (node.left == x && node.right == y) || (node.left == y && node.right == x)
          || isSibling(node.left, x, y) || isSibling(node.right, x, y)
        );
    }

    int level (TreeNode node, TreeNode x, int lev) {
        
        if(node == null) 
            return 0;
        
        if(node == x) 
          return lev;
    
        //find the level of the given node in left side of the tree
        int l = level(node.left, x, lev+1);
        if (l != 0) 
          return l;
        
        //if node not found in left side, find the level of the given node in right side of the tree
        return level(node.right, x, lev+1);
    }
}