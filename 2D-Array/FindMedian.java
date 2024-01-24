import java.util.Arrays;

public class FindMedian {
    
    /*
     * Write a program to find the median of sorted (row wise) matrix. The number of elements present inside the
     * matrix is odd and also the matrix is sorted in ascending order row wise.
     * 
     * Example ar = {{5,11,20,35,45},
     *              {1,2,3,4,6},
     *              {13,15,16,19,21}}
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

    /*
     * Approach 2(Optimized) : Our idea here is to count the number of elements less than or equal to mid value
     * (wherein mid will be the value found by adding min and max of the given matrix and then dividing by 2),
     * by doing this we'll be able to get the median in the entire given matrix.
     * As the matrix has all elements sorted in ascending order the first column will have all the smaller elements
     * and the last column will have all the largest elements, therefore we'll accordingly search the first and last
     * column to find the min and max element.
     * 
     * Time Complexity = O(n^2 Log n)
    */

    static int findMedian2(int[][] mat){

        int min = mat[0][0], max = mat[0][mat[0].length-1];
        
        //finding min and max in the matrix
        for(int i = 0; i < mat.length; i++){
            
            if(mat[i][0] < min)
                min = mat[i][0];
            
            if(mat[i][mat[0].length-1] > max)
                max = mat[i][mat[0].length-1];
        }

        //pass the middle number to each rows of the matrix to count how many numbers are less than or equal to middle number
        int medianPos = ((mat.length * mat[0].length) +1) / 2;

        while(min < max)
        {

            int mid = (min+max)/2;
            int count = 0;

            for(int i = 0; i < mat.length; i++){
                int x = findCount(mat[i], mid);
                count = count + x;
            }
            if(count < medianPos)
                min = mid + 1;
            else
                max = mid;
        }
        return min;
    }

    static int findCount(int[] ar, int mid){

        int count = 0;
        for(int i = 0; i < ar.length; i++){
            if(ar[i] <= mid)
                count++;
            else
                break;
        }
        return count;
    }

    public static void main(String[] args){

        int mat[][] = {{5,11,20,35,45},
                      {1,2,3,4,6},
                      {13,15,16,19,21}};

        System.out.println(findMedian2(mat));
    }
}
