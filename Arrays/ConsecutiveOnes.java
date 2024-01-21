public class ConsecutiveOnes {
    
    /*
     * Write a program to find the maximum consecutive ones in an array.
     * 
     * Example ar = {0,1,1,0,0,1,1,1,0}
     * O/P = 3
    */

    /*
     * Approach 1 (Brute Force) : We'll take two indexes i & j and try to count the occurence of ones.
     * Time Complexity = O(n^2)
    */

    static int approach1(int[] ar){

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

    /*
     * Approach 2 (Optimized) : We'll try to use only ith index to find the maximum consecutive 1's in the array
     * Time Complexity = O(n)
    */

    static int approach2(int[] ar){

        int count = 0, maxCount = 0;
        for(int i = 0; i < ar.length; i++){
            if(ar[i] == 0)
                count = 0;
            else{
                count++;
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }

    public static void main(String[] args){

        int ar[] = {0,1,1,0,0,1,1,1,0};
        System.out.println(approach2(ar));
    }
}
