public class CountSmallOrEqual {
    
    /*
     * Write a program to print the count of smaller or equal elements to the value of given K in a sorted array.
     * 
     * Example arr = {2,6,12,18,21,26,33,42} ; K = 26
     * O/P = 6 (count of numbers less than or equal to K=26)
     * 
     * Example arr = {2,6,12,18,21,26,26,26} ; K = 26
     * O/P = 8 (count of numbers less than or equal to k=26 (count of similar elements also included))
     * 
     * Example arr = {2,6,12,24,26,26,28,30} ; K = 25
     * O/P = 4 (count of numbers less than K=25)
    */

    /*
     * Approach : While using Binary Search the K value in the array will always be pointed out by mid variable hence of we do index mid + 1
     * we'll be able to get the count of all the numbers less than or equal to the given K.
    */

    static int countSmallOrEqual(int[] arr, int key){

        int low = 0, high = arr.length-1, mid = 0;
        while(low <= high){

            mid = (low+high)/2;
            if(key == arr[mid]){

                //check for duplicates and increase the count accordingly, also check that the mid has not exceed array length
                while((mid+1) < arr.length && key == arr[mid+1]){
                    mid++;
                }
                   
            break;
            }
            else if(key < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;

        }
    
    //check if key doesn't exist(If the key doesn't exist then once the loop terminates our mid will be pointing to the next largest number
    //Hence we can return mid which will give the count of all numbers less than the key itself)
        if(arr[mid] > key)
            return mid;
        else
            return mid+1;//normal count(where k exists in the array)
    }
    
    public static void main(String[] args) {
        
        //int arr [] = {2,6,12,18,21,26,33,42};
        int arr[] = {2,6,12,18,21,26,26,26};
        //int arr[] = {2,6,12,24,26,26,28,30};
        int K = 26;

        System.out.println("Count of elements smaller or equal to " + K + " is : " + countSmallOrEqual(arr, K));
    }

}
