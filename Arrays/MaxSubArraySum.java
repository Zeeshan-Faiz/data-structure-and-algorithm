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

    public static void main(String[] args){

        int ar[] = {-1,3,4,-2};
        System.out.println(maxSubArray1(ar));
    }


}
