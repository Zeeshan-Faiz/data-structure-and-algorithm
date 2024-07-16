/*
Given a graph with vertices and each edge between vertices has some weights, find the minimum weight
from source to all other vertices.(Use Dijkstra's Algorithm)
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class DijkstrasAlgorithm {
    
    public class Pair implements Comparable<Pair> {

        int wt;
        int v;
        Pair(int v, int wt) {
            this.v = v;
            this.wt = wt;
        }
        public int compareTo(Pair that) {
            return this.wt - that.wt;
        }
    }

    int[] spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) {

        boolean[] vis = new boolean[V];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(0, 0));//here we assume 0 as the source
        int[] ans = new int[V];
        Arrays.fill(ans, 10000000);
        ans[0] = 0; //from 0 --> 0 (minimum length will be 0)
        
        while (!pq.isEmpty()) {

            Pair cur = pq.remove();
            int u = cur.v;
            // vertex already visited
            if (vis[u])
                continue;

            vis[u] = true;
            ArrayList<ArrayList<Integer>> neighbors = new ArrayList<>();
            for (ArrayList<Integer> list : neighbors) {
                int vertex = list.get(0);
                int wt = list.get(1);
                if (ans[vertex] > ans[u] + wt){
                    ans[vertex] = ans[u] + wt;
                    pq.add(new Pair(vertex, ans[vertex]));
                }
            }
        }
        return ans;
    }
}