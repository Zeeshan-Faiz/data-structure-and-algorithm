/*
Given a graph with vertices and each edges between vertices has some weights, find the minimum weight
that we can get even when all vertices are connected to each other.
*/

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MinSpanningTree_PrimsAlgorithm {

    class Pair implements Comparable<Pair> {

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

    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) {

        boolean[] vis = new boolean[V];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(0, 0));
        int ans = 0;
        while (!pq.isEmpty()) {

            Pair cur = pq.remove();

        }
    }
}