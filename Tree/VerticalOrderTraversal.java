import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalOrderTraversal {
    
    /*
    Given the root of a binary tree, calculate the vertical order traversal of the binary tree.

    For each node at position (row, col), its left and right children will be at positions (row + 1, col - 1) 
    and (row + 1, col + 1) respectively. The root of the tree is at (0, 0).
    The vertical order traversal of a binary tree is a list of top-to-bottom orderings for each 
    column index starting from the leftmost column and ending on the rightmost column. There may 
    be multiple nodes in the same row and same column. In such a case, sort these nodes by their 
    values.
    Return the vertical order traversal of the binary tree.

    Example 1:
    Input: root = [3,9,20,null,null,15,7]
    Output: [[9],[3,15],[20],[7]]
    Explanation:
    Column -1: Only node 9 is in this column.
    Column 0: Nodes 3 and 15 are in this column in that order from top to bottom.
    Column 1: Only node 20 is in this column.
    Column 2: Only node 7 is in this column.

    Example 2:
    Input: root = [1,2,3,4,5,6,7]
    Output: [[4],[2],[1,5,6],[3],[7]]
    Explanation:
    Column -2: Only node 4 is in this column.
    Column -1: Only node 2 is in this column.
    Column 0: Nodes 1, 5, and 6 are in this column.
            1 is at the top, so it comes first.
            5 and 6 are at the same position (2, 0), so we order them by their value, 5 before 6.
    Column 1: Only node 3 is in this column.
    Column 2: Only node 7 is in this column.
    */

    class Pair{
    TreeNode node;
    int row, col;

    Pair(TreeNode node, int row, int col){
        this.node = node;
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {

        Queue<Pair> q = new LinkedList<>();
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        q.offer(new Pair(root, 0, 0));

        while(!q.isEmpty()){

            for(int i = q.size() ; i > 0 ; i--){

               Pair p = q.poll();
               TreeNode currNode = p.node;
               int x = p.row;
               int y = p.col;

               if(!map.containsKey(x))
                    map.put(x, new TreeMap<>());

                if(!map.get(x).containsKey(y))
                    map.get(x).put(y, new PriorityQueue<>());

                map.get(x).get(y).offer(currNode.val);

               if(currNode.left != null){
                   q.offer(new Pair(currNode.left, x - 1, y + 1));
               }

               if(currNode.right != null){
                   q.offer(new Pair(currNode.right, x + 1, y + 1));
               }
            }
        }

        System.out.print(map);

        List<List<Integer>> ans = new ArrayList<>();

        for(TreeMap<Integer, PriorityQueue<Integer>> key : map.values()){
            List<Integer> currList = new ArrayList<>();

            for(PriorityQueue<Integer> nodes : key.values()){
                while(!nodes.isEmpty()){
                    currList.add(nodes.poll());
                }
            }
            System.out.print(currList);
            ans.add(new ArrayList<>(currList));

        }
    
        return ans;
        
    }
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