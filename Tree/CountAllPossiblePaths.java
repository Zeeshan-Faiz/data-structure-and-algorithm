import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CountAllPossiblePaths {

    /*
     * Given the root of a binary tree and a targetSum, find and count all the
     * possible paths that is equal to
     * the given targetSum.
     */

    public int countPaths(TreeNode node, int targetSum) {
        List<Integer> path = new ArrayList<>();
        return helper(node, targetSum, path);
    }

    int helper(TreeNode node, int targetSum, List<Integer> path) {
        
        if (node == null) 
            return 0;

        //calculate all possible paths which leads to targetSum with the current node
        path.add(node.val);
        int count = 0;
        int currentSum = 0;
        //add all the nodes which may lead us to targetSum
        ListIterator<Integer> itr = path.listIterator(path.size());
        while (itr.hasPrevious()) {
            currentSum = currentSum + itr.previous();

            //if we find the currentSum equal to the targetSum, increment the count
            if (currentSum == targetSum) {
                count++;
            }
        }

        count = count + helper(node.left, targetSum, path) + helper(node.right, targetSum, path);

        // backtrack and remove the current node after we've calculated all of it's pathss
        path.remove(path.size() - 1);
        return count;
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