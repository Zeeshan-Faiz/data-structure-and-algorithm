public class GivenPathIsPresentOrNot {

    /*
     * Given the root of a Binary tree and an array containing the path values. Find whether the given
     * path is present in the tree or not.
    */

    boolean findPath(TreeNode node, int[] arr) {

        if (node == null)
            return arr.length == 0;

        return helper(node, arr, 0);
    }

    boolean helper(TreeNode node, int[] arr, int index) {
        
        if(node == null) 
          return false;
        
        //if index is out of bound or current node value is not equal to array value, return false.
        if(index >= arr.length || node.val != arr[index]) 
          return false;
        
        //if you are at the leaf node and at the last index of the array, return true
        if(node.left == null && node.right == null && index == arr.length - 1) 
          return true;
        
        return helper(node.left, arr, index + 1) || helper(node.right, arr, index + 1);
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