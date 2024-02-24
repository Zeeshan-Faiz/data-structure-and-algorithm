import java.util.ArrayList;

public class MoveWithObstacles {

    /*
    * You are in a maze, print all possible path by which you'll be able to reach the target destination, this time the 
    * maze has some obstacle denoted as false to which you can land and need to take some other path otherwise. 
    * keeping in mind you can only go Right(➡️) OR Down(⬇️).
    * Suppose from starting at position (3,3) and destination cell as (0,0) we'll have all possible path as
    * [DDRR, RRDD]
    */

    //Approach 1 : printing the ans directly after each recursive call
    static void pathRestrictions(String ans, boolean[][] maze, int r, int c) {
        
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(ans);
            return;
        }

        //check for the current cell is forbidden/having obstacle
        if (!maze[r][c]) 
            return;

        if (r < maze.length - 1) 
            pathRestrictions(ans + 'D', maze, r+1, c);

        if (c < maze[0].length - 1) 
            pathRestrictions(ans + 'R', maze, r, c+1);
    }

    //Approach 2 : Adding all ans in list and then returning the list after each recusrion
    static ArrayList<String> pathRetRestrictions(String ans, boolean[][] maze, int r, int c) {
        
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (!maze[r][c]) 
            return new ArrayList<>();

        if (r < maze.length - 1) 
            list.addAll(pathRetRestrictions(ans + 'D', maze, r+1, c));

        if (c < maze[0].length - 1) 
            list.addAll(pathRetRestrictions(ans + 'R', maze, r, c+1));

        return list;
    }

    public static void main(String[] args) {
        
        boolean[][] board = {
                            {true, true, true},
                            {true, false, true},
                            {true, true, true}
                            };

        //pathRestrictions("", board, 0, 0);
        System.out.println(pathRetRestrictions("", board, 0, 0));
    }
    
}
