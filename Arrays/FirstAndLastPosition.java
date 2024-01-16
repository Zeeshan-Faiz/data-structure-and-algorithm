public class FirstAndLastPosition {
    
    /*
     * Write a program to find the first and last position of a given number in a sorted array.
     * 
     * Example arr = {3,4,4,4,4,4,4,4,4,6}
     * O/P = [1,8]
     *  
    */

    /*
     * Approach : For this particular problem we'll take an array of length 2 popualted with [-1,-1]
     * And then run two different Binary search in order to get the first and last position of the given number
     * in the array.
     * Time Complexity (for 2 Binary Search) = O(Log N) + O(Log N) = O(2 Log N) ~ O(Log N)
    */

    static int[] searchRange(int[] arr, int key){

        int low = 0, high = arr.length-1, mid = 0;
        int res[] = {-1,-1};

        while(low <= high){

            mid = (low+high)/2;
            if(key == arr[mid]){ //check for the first occurence of the given number
                res[0] = mid;
                high = mid - 1;
            }
            else if(key < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }

        low = 0;
        high = arr.length-1;
        mid = 0;

        while(low <= high){

            mid = (low+high)/2;
            if(key == arr[mid]){ //check for the first occurence of the given number
                res[1] = mid;
                low = mid + 1;
            }
            else if(key < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return res;

    }

    

    
}
