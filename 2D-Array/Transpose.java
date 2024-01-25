public class Transpose {
    
    /*
     * Write a program to find the transpose of nxn matrix.
     * 
     * Example mat = {{1,6,11,16,21},
     *               {2,7,12,17,22},
     *               {3,8,13,18,23},
     *               {4,9,14,19,24},
     *               {5,10,15,20,25}}
     * 
     *  O/P = {{1,2,3,4,5},
     *        {6,7,8,9,10},
     *        {11,12,13,14,15},
     *        {16,17,18,19,20},
     *        {21,22,23,24,25}}
    */

    /*
     * Approach (Brute Force) : We can create a new matrix of the same size of the given matrix, and convert all
     * row elements of the given matrix to column elements to get the transpose. 
     * 
     * Time Complexity = O(n^2)
     * Space Complexity = O(n^2)
    */

    static int[][] transpose1(int[][] mat){

        int[][] res = new int[mat.length][mat.length];
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                res[j][i] = mat[i][j];
            }
        }
        return res;
    }

    /*
     * Approach 2 (Optimized) : Finding the transpose of a matrix without creating a new matrix. If we look closely
     * into the transposed matrix and the original matrix we can find a common pattern which is like:
     * mat[0][1] swap with mat[1][0]
     * similary mat[0][2] swap with mat[2][0] and we can iterate the whole matrix and swap the elements to get the transpose.
     * 
     * Time Complexity = O(n^2)
     * Space Complexity = O(1)
    */

    static void transpose2(int[][] mat){

        //We should note that our ith index will go until mat.length-2
        for(int i = 0; i < mat.length-1; i++){
            for(int j = i+1; j < mat.length; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
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
        // int[][] res = transpose1(mat);
        // printMatrix(res);
        transpose2(mat);
        printMatrix(mat);
    }
}
