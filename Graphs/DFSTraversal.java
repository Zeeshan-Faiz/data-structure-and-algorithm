/*
Given the adjacency list containg the vertex of the graph, print the vertex via dfs traversal.
*/

import java.util.ArrayList;

public class DFSTraversal {

    public ArrayList<Integer> dfs(int V, ArrayList<ArrayList<Integer>> adj){

        boolean[] vis = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < V; i++){
            if(!vis[i])
                helper(i,adj,vis,ans);
        }
        return ans;
    }

    private void helper(int v, ArrayList<ArrayList<Integer>> adj, boolean[] vis, ArrayList<Integer> ans) {
        
        vis[v] = true;
        ans.add(v);
        for(Integer neighbor : adj.get(v)){
            if(!vis[neighbor])
                helper(neighbor, adj, vis, ans);
        }
    }
}