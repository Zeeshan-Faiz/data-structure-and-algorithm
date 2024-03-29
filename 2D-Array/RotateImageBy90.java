public class RotateImageBy90 {
    
    /*
     * You are given a nxn matrix representing an image, rotate the image by 90 degrees clockwise without
     * allocating any new matrix.
     * 
     * Example mat = {{1,2,3},
     *               {4,5,6},
     *               {7,8,9}}
     * 
     * O/P = {{7,4,1},
     *       {8,5,2},
     *       {9,6,3}}
    */

    /*
     * Approach : The direct approach to solve this particular question is to find the transpose of the given matrix
     * and then reverse it in order to find the rotated matrix.
     * 
     * Example mat = {{1,2,3},
     *               {4,5,6},
     *               {7,8,9}}
     * 
     * transpose(mat) = {{1,4,7},
     *                  {2,5,8},
     *                  {3,6,9}}
     * 
     * reverse(transpose(mat)) = {{7,4,1},
     *                            {8,5,2},
     *                            {9,6,3}}
    */

    static void rotateMatrix(int[][] mat){

        //finding transpose
        for(int i = 0; i < mat.length-1; i++){
            for(int j = i+1; j < mat.length; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        //reversing the transposed matrix
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

        int mat[][] = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
                    
        printMatrix(mat);
        System.out.println();

        rotateMatrix(mat);
        printMatrix(mat);
    }
}
