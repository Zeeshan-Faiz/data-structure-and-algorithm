/*
Gidesten a Connected, weighted and Un-directed grapg, find the minimum spanning tree in this graph using
Krushkal's Algorithm.
*/

import java.util.ArrayList;

public class KrushKalsAlgorithm {

    public class Edges implements Comparable<Edges> {

        int src;
        int dest;
        int wt;

        Edges(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
        public int compareTo(Edges that) {
            return this.wt - that.wt;
        }

        static int p[], rank[];
        static void union(int x, int y){
            int rx = find(x);
            int ry = find(y);
            if(rx == ry)
                return;
            p[ry] = rx;
        }

        static int find(int x){
            if(p[x] == x)
                return x;
            return find(p[x]);
        }

        static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) {

        boolean[][] vis = new boolean[V][V];
        
    }
}