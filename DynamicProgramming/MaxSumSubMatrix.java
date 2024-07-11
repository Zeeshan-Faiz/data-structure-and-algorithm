/*
Given a 2-Dimensional matrix of size RxC. Find the maximum sum submatrix.
*/

import java.util.Arrays;

public class MaxSumSubMatrix {

    public int maxSumSubMatrix(int R, int C, int[][] M){

        int[] sum = new int[R];
        int maxSum = Integer.MIN_VALUE;
        for(int cStart = 0; cStart < C; cStart ++){
            Arrays.fill(sum, 0);
            for(int cEnd = cStart; cEnd < C; cEnd ++){
                for(int row = 0; row < R; row ++){
                    sum[row] += M[row][cEnd];
                }
                int currMaxSum = kadans(sum);
                maxSum = Math.max(maxSum, currMaxSum);
            }
        }
        return maxSum;
    }

    int kadans(int[] a){
        
        int size = a.length;
        int max = Integer.MIN_VALUE, max_end = 0;
        for(int i = 0; i < size; i++){
            max_end = max_end + a[i];
            if(max < max_end)
                max = max_end;
            if(max_end < 0)
                max_end = 0;
        }
        return max;
    }
}