public class AlternateEvenOdd {
    
    /*
     * Write a program to find the maximum length of alternating even odd subarray.
     * 
     * Example ar = {8,10,13,14} O/P = 3 (here 10,13,14 are the maximum even/odd alternating element)
     * Example ar = {5,12,11,16} O/P = 4 (here 5,12,11,16 are the maximum alternating even/odd element)
     * Example ar = {8,10,6,2} O.P = 1 (here there's no alternating even/odd element, hence return 1)
    */

    /*
     * Approach (Brute Force) : Take each element at a time and traverse the whole array finding the occurrence of
     * alternating even and odd elements and at last find the max length of alternating elements.
     * 
     * Time Complexity = O(n^2)
    */

    static int maxEvenOdd1(int[] ar){

        int maxCount = 0;
        for(int i = 0; i < ar.length; i++){
            int count = 1;
            for(int j = i+1; j < ar.length-1; j++){
                if(ar[j]%2 == 0 && ar[j+1]%2 !=0 || ar[j]%2 != 0 && ar[j+1]%2 ==0)
                    count++;
                else 
                    break;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }

    public static void main(String[] args){

        int ar[] = {8,10,13,14};
        System.out.println(maxEvenOdd1(ar));
    }

}
