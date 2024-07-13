/*
You are given the adjacency list containg the vertices of a Directed Acyclicgraph, return the array
of vertices in topological order.
*/

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSortUsingDFS {
    
    public int[] isCycle(int V, ArrayList<ArrayList<Integer>> adj) {

        boolean[] vis = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < V; i++) {
            if (!vis[i])
                dfs(adj,i,stack,vis);
        }
        int[] ans = new int[V];
        int i = 0;
        while(!stack.isEmpty())
            ans[i++] = stack.pop();
        return ans;
    }
}