import java.util.ArrayList;

public class MoveDiagonal {

    /*
     * You are in a maze, print all possible path by which you'll be able to reach the target destination
     * keeping in mind you can only go Horizontal(➡️) OR Vertical(⬇️) Or Diagonal(↘️) as well.
     * Suppose from starting at position (3,3) and destination cell as (0,0) we'll have all possible path as
     * [DD, DVH, DHV, VDH, VVHH, VHD, VHVH, VHHV, HDV, HVD, HVVH, HVHV, HHVV] 
    */

    //Approach 1 : printing the ans directly after each recursive call
    static void pathDiagonal(String ans, int r, int c) {

        if (r == 1 && c == 1) {
            System.out.println(ans);
            return;
        }

        //Going Down
        if (r > 1) 
        pathDiagonal(ans + 'V', r-1, c);
        //Going Right
        if (c > 1) 
        pathDiagonal(ans + 'H', r, c-1);
        //Going Diagonal
        if (r > 1 && c > 1) 
        pathDiagonal(ans + 'D', r-1, c-1);
    }
    
    //Approach 2 : Adding all ans in list and then returning the list after each recusrion
    static ArrayList<String> pathRetDiagonal(String ans, int r, int c) {
        
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList<String> res = new ArrayList<>();

        if (r > 1 && c > 1) 
            res.addAll(pathRetDiagonal(ans + 'D', r-1, c-1));

        if (r > 1) 
            res.addAll(pathRetDiagonal(ans + 'V', r-1, c));

        if (c > 1) 
            res.addAll(pathRetDiagonal(ans + 'H', r, c-1));

        return res;
    }

    public static void main(String[] args) {
        
        //pathDiagonal("", 3, 3);
        System.out.println(pathRetDiagonal("", 3, 3));
    }
}