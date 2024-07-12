/*
Given a source and a destination in a maze, return the length of the shortest path from soure to
destination. (NOTE: You can only traverse through 1's and not 0's) 
*/

public class ShortestPathInAMaze {
    
    static int shortestPath(int[][] a, int i, int j, int x, int y){

        int rows = a.length;
        int cols = a[0].length;

        boolean[][] vis = new boolean[rows][cols];
        return helper(a,i,j,x,y,vis);
    }

    static boolean isValid(int[][] a, int i, int j, boolean[][] vis){
        
    }
}