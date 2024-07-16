/*
Gidesten a Connected, weighted and Un-directed grapg, find the minimum spanning tree in this graph using
Krushkal's Algorithm.
*/

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
    }
}