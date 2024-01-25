public class ReverseMatrix {
    
    /*
     * Write a program to reverse(mirror) the columns of a given matrix. 
     * 
     *                              (mirror)
     * Example mat = {{1,6,11,16,21},  |  {21,16,11,6,1}
     *               {2,7,12,17,22},   |  {22,17,12,7,2}
     *               {3,8,13,18,23},   |  {23,18,13,8,3}
     *               {4,9,14,19,24},   |  {24,19,14,9,4}
     *               {5,10,15,20,25}}  |  {25,20,15,10,5}  
    */

    /*
     * Approach : If we take a row from the matrix as an example and observe how it is transforming, we can 
     * see that - 
     *                          (mirror)
     *                            |
     *      1   6   11   16   21  |   21   16   11   6   1
     *                            |   
     * the last element in this row is swapped with the first element, and the second last element is swapped with
     * second element and so on.
     * We'll be having two indexes left and right to help us swap elements accordingly amd will do the same steps
     * for all the rows of the matrix to get the desired output.
    */

    static void reverseMatrix(int[][] mat){

        for(int i = 0; i < mat.length; i++){
            
            int left = 0, right = mat[0].length-1;
            while(left < right)
            {
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    static void printMatrix(int[][] mat){

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        int mat[][] = {{1,6,11,16,21},
                      {2,7,12,17,22},
                      {3,8,13,18,23},
                      {4,9,14,19,24},
                      {5,10,15,20,25}};
                    
        printMatrix(mat);
        System.out.println();

        reverseMatrix(mat);
        printMatrix(mat);
    }
}
