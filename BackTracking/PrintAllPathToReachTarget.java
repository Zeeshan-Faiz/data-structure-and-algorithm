public class PrintAllPathToReachTarget {
    
    /*
     * You are in a maze, print all possible path by which you'll be able to reach the target destination
     * keeping in mind you can only go Right(➡️) OR Down(⬇️)
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

}
