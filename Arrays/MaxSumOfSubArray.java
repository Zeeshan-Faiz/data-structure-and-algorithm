public class MaxSumOfSubArray {
    
    /*
     * Write a program to find the maximum sum subarray of size k.
     * 
     * Example ar = {2,9,31,-4,21,7} k = 3(size of subarray)
     * O/P = 48
    */

    /*
     * Approach (Brute Force) : We'll try to find the sum of each sub array and after iterating the whole array
     * will return the maximum sum stored.
     * 
     *      subarray         sum
     *      2 9 31           42    
     *      9 31 -4          36
     *      31 -4 21         48 (max sum)
     *      -4 21 7          24
     *
     * Time Complexity = O(n^2)
    */

    static int maxSum(int[] ar, int k){

        int cSum = 0, maxSum = Integer.MIN_VALUE, l = k;
        for(int i = 0; i < ar.length-k; i++){
            for(int j = i; j < l; j++){
                cSum = cSum + ar[j];
            }
            maxSum = Math.max(maxSum, cSum);
            cSum = 0;
            l++;
        }
        return maxSum;
    }

    /*
     * Approach 2(Optimized - Sliding window technique) : It involves maintaining a set of elements within a 
     * "window" that moves through the array and updating the window at each step.
     * 
     * Example ar = {2,9,31,-4,21,7} k = 3(size of sub array)
     *                  
     * sliding window = 🟧🟧🟧
     * Our idea is to move the window forward in the given array "remove" the element from the left side of the window
     * by subtracting the left element and "add" one right element into the window by addition of the right element.
     * 
     * 2+9+31 = 42
     * 9+31-4 = 36
     * 31-4+21 = 48
     * -4+21+7 = 24
     * we'll store the max sum which in this case is 48 and return it.
     * 
     * Time Complexity = O(n)
    */

    

    public static void main(String[] args){

        int ar[] = {2,9,31,-4,21,7};
        System.out.println(maxSum(ar,3));
    }
}
