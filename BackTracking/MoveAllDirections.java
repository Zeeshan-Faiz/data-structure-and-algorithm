public class MoveAllDirections {

     /*
     * You are in a maze, print all possible path by which you'll be able to reach the target destination
     * keeping in mind you can move all directions; Right(➡️) OR Down(⬇️) Or Left(⬅️) Or Up(⬆️) as well.
     * Suppose from starting at position (0,0) and destination cell as (2,2) we'll have all possible path as
     * 
    */

    /*
     * Backtracking : We have to understand that when we are given the choice of moving in all directions then it might
     * happen that we come to the same path which we've already traversed which will end in an infinite recursive calls and 
     * finally getting stackoverflow error.
     * To avoid it we'll have to make sure that for each cell that we traverese we'll have to mark it as false and once we are done with 
     * with the path need to unmark it as true so that other recursive calls are not affected by it.
     * 
    */

    static void allPath(String ans, boolean[][] maze, int r, int c) {
        
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(ans);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        //Consider this cell is going to be traversed, hence mark it false
        maze[r][c] = false;

        //Going Down
        if (r < maze.length - 1)
            allPath(ans + 'D', maze, r+1, c);
        //Going Right
        if (c < maze[0].length - 1)
            allPath(ans + 'R', maze, r, c+1);
        //Going Up
        if (r > 0) 
            allPath(ans + 'U', maze, r-1, c);
        //Going Left
        if (c > 0) 
            allPath(ans + 'L', maze, r, c-1);

        // this line is where the function will be over
        // so before the function gets removed, unmark the visited cell to avoid infinite recursive calls
        maze[r][c] = true;
    }


    
}
