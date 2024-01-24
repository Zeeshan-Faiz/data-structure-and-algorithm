import java.util.Arrays;

public class FindMedian {
    
    /*
     * Write a program to find the median of sorted (row wise) matrix. The number of elements present inside the
     * matrix is odd and also the matrix is sorted in ascending order row wise.
     * 
     * Example ar = {{5,11,20,35,45},
     *              {1,2,3,4,6},
     *              {13,15,16,19,21}}
     * 
     * O/P = 15
    */

    /*
     * Approach 1 (Brute Force) : We'll create a new array and copy all the elements from the given matrix and then 
     * sort this newly created array and then find the median.
     * 
     * Time Complexity = O(mxn Log (mxn))
    */

    static int findMedian1(int [][] mat){

        int ar [] = new int [mat.length * mat[0].length];
        int k = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                ar[k] = mat[i][j];
                k++;
            }
        }

        Arrays.sort(ar);

        return ar[ar.length/2];
    }

    public static void main(String[] args){

        int mat[][] = {{5,11,20,35,45},
                      {1,2,3,4,6},
                      {13,15,16,19,21}};

        System.out.println(findMedian1(mat));
    }




}
