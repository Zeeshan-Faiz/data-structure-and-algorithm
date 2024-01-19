public class CheckSorted {
    
    /*
     * Write a program to check whether the given array is sorted or not.
     * Example ar = {2,4,6,8,10,12,14}
     * O/P = true
    */

    static boolean isSorted(int[] ar){

        for(int i = 1; i < ar.length; i++){
            if(ar[i] <ar[i-1])
                return false;
        }
        return true;
    }

    


}
