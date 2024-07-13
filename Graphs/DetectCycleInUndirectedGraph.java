/*
You are given the adjacency list containg the vertices of a graph, check whether the graph contains
cycle or not.
*/

import java.util.ArrayList;

public class DetectCycleInUndirectedGraph {

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {

        boolean[] vis = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i])
                if (dfs(i, adj, vis, -1))
                    return true;
        }
        return false;
    }

    private boolean dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] vis, int parent) {

        vis[v] = true;
        for (Integer neighbor : adj.get(v)) {
            if (!vis[neighbor]) {
                if (dfs(neighbor, adj, vis, v))
                    return true;
            } else if (parent != neighbor)
                return true;
        }
        return false;
    }
}