/*
Given a graph with vertices and each edges between vertices has some weights, find the minimum weight
that we can get even when all vertices are connected to each other.
*/

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MinSpanningTree_PrimsAlgorithm {

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

    int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) {

        boolean[] vis = new boolean[V];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(0, 0));
        int ans = 0;
        while (!pq.isEmpty()) {

            Pair cur = pq.remove();
            int u = cur.v;
            // vertex already visited
            if (vis[u])
                continue;

            ans += cur.wt;
            vis[u] = true;
            ArrayList<ArrayList<Integer>> neighbor = new ArrayList<>();
            for (ArrayList<Integer> list : neighbor) {
                int vertex = list.get(0);
                int wt = list.get(1);
                if (vis[vertex] == false)
                    pq.add(new Pair(vertex, wt));
            }
        }
        return ans;
    }
}