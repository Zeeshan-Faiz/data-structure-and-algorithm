/*
Given a graph with vertices and each edge between vertices has some weights, find the minimum weight
from source to all other vertices.(Use Dijkstra's Algorithm)
*/

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
}