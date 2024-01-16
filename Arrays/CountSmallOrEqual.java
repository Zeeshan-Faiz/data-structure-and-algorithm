public class CountSmallOrEqual {
    
    /*
     * Write a program to print the count of smaller or equal elements in a sorted array.
     * 
     * Example arr = {2,6,12,18,21,26,33,42} ; K = 26
     * O/P = 6 (count of numbers less than or equal to K=26)
     * 
     * Example arr = {2,6,12,18,21,26,26,26} ; K = 26
     * O/P = 8 (count of numbers less than or equal to k=26 (count of similar elements also included))
     * 
     * Example arr = {2,6,12,24,26,26,28,30} ; K = 35
     * O/P = 4 (count of numbers less than K=25)
    */

    /*
     * Approach : 
    */

    static int countSmallOrEqual(int[] arr, int key){

        int low = 0, high = arr.length-1, mid = 0;
        while(low <= high){

            mid = (low+high)/2;
            if(key == arr[mid]){

                //check for duplicates and increase the count accordingly
            }
        }


    }

}
