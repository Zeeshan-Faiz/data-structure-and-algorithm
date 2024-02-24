public class PrintAllPathToTarget {

    /*
     * Write a program to print all the possible combinations of path going from point A to point B in a maze.
    */

    static int count(int r, int c) {

        if (r == 1 || c == 1) 
            return 1;
        
        int left = count(r-1, c);
        int right = count(r, c-1);
        
        return left + right;
    }
    
}
