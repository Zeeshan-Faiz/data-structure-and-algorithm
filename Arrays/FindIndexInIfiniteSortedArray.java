/*
Given an array containing infinite sorted integers and an element,  write a program to find the position of the 
element.”

Example 1:
Input: N = 89, arr[] = {9, 11, 17, 26, 37, 52, 89, 111, 129, 144, 198}
Output: 6
*/

public class FindIndexInIfiniteSortedArray {

    /*
     * Take bunch of elements, apply binary search to find the target element, if the element is not found in this batch
     * take the next bigger batch and continue finding the target element.
     * We'll try to double the window size after every iteration ot maximise optimisation.
    */

    static int binarySearch(int[] arr, int target, int low, int high){

        while(low <= high){

            int mid = (low+high)/2;
            if(arr[mid] == target)
                return mid;
            if(arr[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;   
        }
        return -1;
    }

    static int ans(int[] arr, int target){

        //start with window size of 2;
        int low = 0;
        int high = 1;

        while(target > arr[high]){
            //change window size
            int temp = high + 1;
            high = (high - low + 1) * 2;
            low = temp;
        }
        return binarySearch(arr, target, low, high);
    }

    public static void main(String[] args) {
        
        int[] arr = {9, 11, 17, 26, 37, 52, 89, 111, 129, 144, 198};
        System.out.println(ans(arr, 89));
    }
}
