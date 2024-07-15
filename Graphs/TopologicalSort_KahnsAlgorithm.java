/*
You are given the adjacency list containg the vertices of a Directed Acyclic graph, return the array
of vertices in topological order using BFS(Kahn's Algorithm).
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TopologicalSort_KahnsAlgorithm {
    
    public int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {


        int[] inDeg = new int[V];
        //calculate In-Degree for each vertex
        for(ArrayList<Integer> list : adj){
            for(Integer e : list)
                inDeg[e]++;
        }

        ArrayList<Integer> ansList = new ArrayList<>();
        bfs(adj,V,ansList,inDeg);
        
        return ans;
    }

    private void bfs(ArrayList<ArrayList<Integer>> adj, int v,ArrayList<Integer> ansList, int[] inDeg) {
        
        Queue<Integer> queue = new LinkedList<>();
        //add first vertex with In-Degree as 0
        for(int i = 0; i < v; i++){
            if(inDeg[i] == 0)
                queue.add(i);
        }
        while(!queue.isEmpty()){
            int cur = queue.poll();
            ansList.add(cur);

            for(int neighbor : adj.get(cur)){
                if(--inDeg[neighbor] == 0)
                    queue.add(neighbor);
            }
        }
    }
}