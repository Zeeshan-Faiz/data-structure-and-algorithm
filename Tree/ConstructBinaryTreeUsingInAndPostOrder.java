public class ConstructBinaryTreeUsingInAndPostOrder {
 
    /*
     * Given two integer arrays preorder and inorder where preorder is the preorder
     * traversal of a binary tree and inorder is the inorder traversal of the same tree, construct
     * and return the binary tree.

     * Example 1:
     * Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
     * Output: [3,9,20,null,null,15,7]
     
     * Example 2:
     * Input: preorder = [-1], inorder = [-1]
     * Output: [-1]
    */

    public TreeNode buildTree(int[] preOrder, int[] inOrder) {
        HashMap<Integer, Integer> map = new HashMap<>();

        //add all the inorder elements in the hashmap along with it's index
        for (int i = 0; i < inOrder.length; i++) {
            map.put(inOrder[i], i);
        }
        int[] index = { 0 };

        return helper(preOrder, inOrder, 0, preOrder.length - 1, map, index);
    }

    public TreeNode helper(int[] preOrder, int[] inOrder, int left, int right, HashMap<Integer, Integer> map,
            int[] index) {
        
        if (left > right) 
            return null;
        
        int current = preOrder[index[0]];
        index[0]++;

        TreeNode node = new TreeNode(current);

        if (left == right) {
            return node;
        }

        //use hashmap to get the element from inorder along with it index
        int inOrderIndex = map.get(current);

        node.left = helper(preOrder, inOrder, left, inOrderIndex - 1, map, index);
        node.right = helper(preOrder, inOrder, inOrderIndex + 1, right, map, index);

        return node;
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