public class ConsecutiveOnes {
    
    /*
     * Write a program to find the maximum consecutive ones in an array.
     * 
     * Example ar = {0,1,1,0,0,1,1,1,0}
     * O/P = 3
    */

    /*
     * Approach 1 (Brute Force) 
     * Time Complexity = O(n^2)
    */

    static int Approach1(int[] ar){

        int maxCount = 0;
        for(int i = 0; i < ar.length; i++){
            int count = 0;
            for(int j = i; j < ar.length; j++){
                if(ar[j] == 1)
                    count++;
                else
                    break;
            }
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }


}
