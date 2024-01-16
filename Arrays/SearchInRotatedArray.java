public class SearchInRotatedArray {
    
    /*
     * Given an array integer sorted in ascending order (all distinct elemenets), and then the array is rotated
     * at an unknown pivot point. Now you need to search for a target element (key) in this rotated araay with
     * time complexity of O(Log N)
     * 
     * Example original array   = {0,1,2,4,5,6,7,8}
     * Roated array at pivot(3) = {4,5,6,7,8,0,1,2} ; key = 0
     * O/P = 4
    */

    /*
     * Approach : If we look closely into the rotated array we'll observe that it has two sorted arrays inside
     * it.
     *                     <---->
     *          [4,5,6,7,8,0,1,2]
     *          <-------->
     * So we'll have two conditions to check for the given key in both the parts of the array using Binary Search.
    */

    static int search(int[] arr, int key){

        int low = 0, high = arr.length-1, mid = 0;
        while(low <= high){

            mid = (low+high)/2;
            if(key == arr[mid])
                return mid;
            
            else if(arr[low] <= arr[mid]){ //left sorted array
                if(key >= arr[low] && key < arr[mid])
                    high = mid - 1;
                else   
                    low = mid + 1;
            }

            else{ // right sorted array
                if(key > arr[mid] && key <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        
        int arr [] = {4,5,6,7,8,0,1,2};
        int key = 0;

        System.out.println("Position of the given number " + key + " is : " + search(arr, key));
    }

}
