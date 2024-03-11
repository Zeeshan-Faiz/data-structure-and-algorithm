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
}