import javax.swing.tree.TreeNode;

public class FlattenBinaryToLinkedList {
    
    /*
    Given the root of a binary tree, flatten the tree into a "linked list":

    The "linked list" should use the same TreeNode class where the right child pointer points to the next node 
    in the list and the left child pointer is always null.
    The "linked list" should be in the same order as a pre-order traversal of the binary tree.

    Example 1:
    Input: root = [1,2,5,3,4,null,6]
    Output: [1,null,2,null,3,null,4,null,5,null,6]
    */

    public void flatten(TreeNode root) {
        
        TreeNode current = root;
        while (current != null) {
            if (current.left != null) {
                    TreeNode temp = current.left;
                    
                    while(temp.right != null) {
                        temp = temp.right;
                }

                temp.right = current.right;
                current.right = current.left;
                current.left= null;
            }
        current = current.right;
        }
    }

}