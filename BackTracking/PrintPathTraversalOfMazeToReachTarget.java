import java.util.Arrays;

public class PrintPathTraversalOfMazeToReachTarget {

    /*
    * You are in a maze, print all possible path traversal by which you'll be able to reach the target destination
    * keeping in mind you can move all directions; Right(➡️) OR Down(⬇️) Or Left(⬅️) Or Up(⬆️) as well.
    * Suppose from starting at position (0,0) and destination cell as (2,2) we'll have all possible path as
    * 
    * 

    */

    static void allPathPrint(String ans, boolean[][] maze, int r, int c, int[][] path, int step) {
        
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(ans);
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        //Consider this cell is going to be traversed, hence mark it false and add the step in the path matrix
        maze[r][c] = false;
        path[r][c] = step;
        if (r < maze.length - 1) {
            allPathPrint(ans + 'D', maze, r+1, c, path, step+1);
        }

        if (c < maze[0].length - 1) {
            allPathPrint(ans + 'R', maze, r, c+1, path, step+1);
        }

        if (r > 0) {
            allPathPrint(ans + 'U', maze, r-1, c, path, step+1);
        }

        if (c > 0) {
            allPathPrint(ans + 'L', maze, r, c-1, path, step+1);
        }
    
        //unmark the visited cell to avoid infinite recursive calls and also make the cell of path matrix = 0
        maze[r][c] = true;
        path[r][c] = 0;

    }
    
}