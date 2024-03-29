public class MaxSubArraySum {
    
    /*
     * Write a program to find the contagious subarray (containing atleast one element) which has the largest sum.
     * 
     * Example ar = {-1,3,4,-2}
     * O/P = 7
    */

    /*
     * Approach 1 : We'll try to find the sum of each sub arrays and store it in the variable maxSum and similary
     * iterate over the whole array to get the largest sum.
     * 
     * Example = {-1,3,4,-2}
     * 
     *      Sub Array       sum
     *      -1              -1
     *      -1 3             2
     *      -1 3 4           6
     *      -1 3 4 -2        4
     *      3                3
     *      3 4              7 (largest sum)
     *      3 4 -2           5
     *      4                4
     *      4 -2             2
     *      -2              -2 
     * 
     *Time Complexity = O(n^2) 
    */

    static int maxSubArray1(int[] ar){

        int maxSum = 0;
        for(int i = 0; i < ar.length; i++){
            int sum = 0;
            for(int j = i; j < ar.length; j++){
                sum = sum + ar[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    /*
     * approach 2 (Kadane's Algorithm) : This algorithm is based on the idea of maintaining a running sum of the 
     * elements and resetting the sum to zero whenever it becomes negative, as a negative sum would only reduce 
     * the maximum subarray sum. The algorithm iterates through the array, updating the current sum and keeping 
     * track of the maximum sum encountered so far.
     * 
     * Time Complexity = O(n)
    */

    static int maxSubArray2(int[] ar){

        int sum = ar[0], maxSum = ar[0];
        for(int i = 1; i < ar.length; i++){
            if(sum >= 0)
                sum = sum + ar[i];
            else
                sum = ar[i];
            if(sum > maxSum)
                maxSum = sum;
        }
        return maxSum;
    }

    public static void main(String[] args){

        int ar[] = {-1,3,4,-2};
        System.out.println(maxSubArray2(ar));
    }
}
