public class PrintBoundaryClockwise {
    
    /*
     * Write a program to print the boundary elements in clockwise direction.
     * 
     * Example ar = {{1,2,3,4,5},
     *              {6,7,8,9,10},
     *              {11,12,13,14,15},
     *              {16,17,18,19,20},
     *              {21,22,23,24,25}}
     * 
     * O/P = 1 2 3 4 5 10 15 20 25 24 23 22 21 16 11 6
    */

    /*
     * Approach : For printing the elements clockwise we'll break this problem into smaller sub problems.
     * We'll print the first row : i = 0 and j = 0 to len(ar)-1 
     * Then we'll print last column : j = len(ar)-1 and i = 1 to len(ar)-1
     * We'll print the last row : i = len(ar)-1 and j = len(ar)-1 to 0
     * And at last we'll print the first column : j = 0 and i = len(ar)-2 to 1
    */

    static void printBoundary(int[][] ar){

        //print first row
        int i = 0, j = 0;
        for(j = 0; j < ar.length; j++)
            System.out.print(ar[i][j]);

        //print last column
        j = ar.length-1;
        for(i = 1; 1 < ar.length; i++)
            System.out.print(ar[i][j]);

        //print last row
        i = ar.length-1;
        for(j = ar.length-2; j >= 0; j--)
            System.out.print(ar[i][j]);

        //print first column
        j = 0;
        for(i = ar.length-2; i > 0; i--)
            System.out.print(ar[i][j]);


    }

    public static void main(String[] args){

        int ar[][] = {{1,2,3,4},
                      {5,6,7,8},
                      {9,10,11,12},
                      {13,14,15,16}};

        printZigZag(ar);
    }

}
