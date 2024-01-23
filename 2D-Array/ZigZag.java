public class ZigZag {
    
    /*
     * Write a program to print the 2D-matrix in ZIg-Zag form. 
     * 
     * Example = [[1,2,3,4],
     *            [5,6,7,8],
     *            [9,10,11,12],
     *            [13,14,15,16]]
     * 
     * O/P = 1,2,3,4,8,7,6,5,9,10,11,12,16,15,14,13 
    */

    /*
     * Approach : If we look closely into the matrix we can observe that all the elements present at even positions
     * are displayed normally and all the elements present at odd positions are displayed in reverse.
    */

    static void printZigZag(int[][] ar){

        for(int i = 0; i < ar.length; i++){
            if(i%2 == 0){
                for(int j = 0; j < ar[i].length; j++)
                    System.out.print(ar[i][j] + ",");
            }
            else{
                for(int j = ar[i].length-1; j >= 0; j--)
                    System.out.print(ar[i][j] + ",");
            }
        }
    }

    public static void main(String[] args){

        int ar[][] = {{1,2,3,4},
                      {5,6,7,8},
                      {9,10,11,12},
                      {13,14,15,16}};

        printZigZag(ar);
    }


}
