/*
Given a source and a destination in a graph find whether there's a shortest path possible between them.
*/

import java.util.ArrayList;
import java.util.LinkedList;

public class ShortestPath{

    static boolean bfs(ArrayList<ArrayList<Integer>> adj, int src, int dest, int v, int[] pred, int[] dist){

        LinkedList<Integer> queue = new LinkedList<>();
        boolean[] vis = new boolean[v];
        for(int i = 0; i < v; i++){
            vis[i] = false;
            dist[i] = Integer.MAX_VALUE;
            pred[i] = -1;
        }

        vis[src] = true;
        dist[src] = 0;
        queue.add(src);
        int u = 1;

        while(!queue.isEmpty()){

            int cur = queue.remove();
            for(int i = 0; i < adj.get(u).size(); i++){
                int neighbor = adj.get(u).get(i);
                if(vis[neighbor] ==  false){
                    vis[neighbor] = true;
                    dist[neighbor] = dist[src] + 1;
                    pred[neighbor] = cur;
                    queue.add(neighbor);

                    if(neighbor == dest)
                        return true; // found the path
                }
            }
            u++;
        }
        return false;
    }
}