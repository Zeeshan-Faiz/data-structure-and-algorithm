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

        int rows = a.length;
        int cols = a[0].length;

        return i >= 0 && j >= 0 && i < rows && j < cols && a[i][j] == 1 && !vis[i][j];
    }

    static int helper(int[][] a, int i, int j, int x, int y, boolean[][] vis){

        if(!isValid(a, i, j, vis))
            return 1000000;

        if(i == x && j == y)
            return 0;

        vis[i][j] = true;
        int left = helper(a, i, j-1, x, y, vis);
        int bottom = helper(a, i+1, j, x, y, vis);
        int right = helper(a, i, j+1, x, y, vis);
        int top = helper(a, i-1, j, x, y, vis);

        //backtract
        vis[i][j] = false;

        return Math.min(Math.min(left, bottom), Math.min(right, top));
    }
}