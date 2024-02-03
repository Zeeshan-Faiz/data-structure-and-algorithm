/*
Given an integer array, sort the array elements using Bubble Sort.
*/

import java.util.Arrays;

public class BubbleSort {

    /*
    Approach : We'll run two for loops one will(i) track the number of passed made to the element and the other for loop (j)
    will actually swap the numbers in ascending order. We'll also make sure that we don't iterate over the whole array
    every time as with each pass(i) the last element will be sorted and also we'll put a flag 'swapped' so that for any
    pass(i) if there's no swapping happened that we can assume that the array elements are now sorted and we can break
    from the loop.

    Time Complexity = O(N^2)
    */
    
    static void bubbleSort(int[] arr) {
        
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]) {

                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
