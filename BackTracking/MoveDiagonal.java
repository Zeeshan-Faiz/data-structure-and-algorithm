import java.util.ArrayList;

public class MoveDiagonal {

    /*
     * You are in a maze, print all possible path by which you'll be able to reach the target destination
     * keeping in mind you can only go Horizontal(➡️) OR Vertical(⬇️) Or Diagonal(↘️) as well.
     * Suppose from starting at position (3,3) and destination cell as (0,0) we'll have all possible path as
     * [] 
    */
    
    static ArrayList<String> pathRetDiagonal(String ans, int r, int c) {
        
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r > 1 && c > 1) 
            list.addAll(pathRetDiagonal(ans + 'D', r-1, c-1));

        if (r > 1) 
            list.addAll(pathRetDiagonal(ans + 'V', r-1, c));

        if (c > 1) 
            list.addAll(pathRetDiagonal(ans + 'H', r, c-1));

        return list;
    }

}