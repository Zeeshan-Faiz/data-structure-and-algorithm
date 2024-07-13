/*
You are given the adjacency list containg the vertices of a Directed graph, check whether the graph contains
cycle or not.
*/

import java.util.ArrayList;

public class DetectCycleInDirectedGraph {
    
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {

        boolean[] vis = new boolean[V];
        boolean[] recS = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i])
                if (dfs(i, adj, vis, recS))
                    return true;
        }
        return false;
    }

    private boolean dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] vis, boolean[] recS) {
        
        vis[v] = true;
        recS[v] = true;
        for (Integer neighbor : adj.get(v)) {
            if (!vis[neighbor]) {
                if (dfs(neighbor, adj, vis, recS))
                    return true;
            } 
            else if (recS[neighbor])
                return true;
        }
        recS[v] = false;
        return false;
    }
}