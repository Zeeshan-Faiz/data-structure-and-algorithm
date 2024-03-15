import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Node;

public class CountAllPossiblePaths {
    
    /*
    Given the root of a binary tree and a targetSum, find and count all the possible paths that is equal to
    the given targetSum.
    */

    public int countPaths(TreeNode node, int sum) {
        List<Integer> path = new ArrayList<>();
        return helper(node, sum, path);
    }

    public class TreeNode {
        
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}