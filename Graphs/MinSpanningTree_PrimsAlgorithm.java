/*
Given a graph with vertices and each edges between vertices has some weights, find the minimum weight
that we can get even when all vertices are connected to each other.
*/

public class MinSpanningTree_PrimsAlgorithm {
    
    class Pair implements Comparable<Pair>{

        int wt;
        int v;
        Pair(int v, int wt){
            this.v = v;
            this.wt = wt;
        }
        public int compareTo(Pair that){
            return this.wt - that.wt;
        }
    }
}