/*
Given a graph with vertices and each edge between vertices has some weights(here we can have negative weights as well), 
Find whether the graph contains Negative Weight Cycle.
*/

import java.util.Arrays;

public class BellmanFordAlgorithm {

    public int isNWC(int V, int[][] edges) {

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;// randomly choosing 0 as the source

        // we'll use Bellman Ford Algorithm to check for shortest path
        for (int count = 1; count < V; count++) 
        {
            for (int j = 0; j < edges.length; j++) 
            {
                int src = edges[j][0];
                int dest = edges[j][1];
                int weight = edges[j][2];
                if (dist[src] != Integer.MAX_VALUE && dist[dest] > dist[src] + weight)
                    dist[dest] = dist[src] + weight;
            }
        }

        // Now we'll run the iterations once more time and if the distance array gets values smaller than
        // what we got in the V-1 iterations, then definitely the graph has Negative Weighted Cycle
        for (int j = 0; j < edges.length; j++) 
        {
            int src = edges[j][0];
            int dest = edges[j][1];
            int weight = edges[j][2];
            if (dist[src] != Integer.MAX_VALUE && dist[dest] > dist[src] + weight)
                return 1;
        }
        return 0;
    }
}