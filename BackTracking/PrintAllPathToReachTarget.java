public class PrintAllPathToReachTarget {
    
    /*
     * You are in a maze, print all possible path by which you'll be able to reach the target destination
     * keeping in mind you can only go Right(➡️) OR Down(⬇️).
     * Suppose from starting at position (3,3) and destination cell as (0,0) we'll have all possible path as 
     * []
    */
    
    //Approach 1 : printing the ans directly after each recursive call
    static void path(String ans, int r, int c) {

        if (r == 1 && c == 1) {
            System.out.println(ans);
            return;
        }

        //Going Down
        if (r > 1) 
            path(ans + 'D', r-1, c);
        //Going Right
        if (c > 1) 
            path(ans + 'R', r, c-1);
    }

    public static void main(String[] args) {
        
        path("", 3, 3);
    }

}
