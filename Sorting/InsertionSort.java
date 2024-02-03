/*
Given an array of integers, sort the array in ascending order using Insertion Sort technique.
*/

import java.util.Arrays;

public class InsertionSort {

    /*
    Approach : We'll be traversing the array from left to right using the index j and after every pass we'll try to
    insert the jth element in the left hand side of the array and we'll do this step until all array elements are
    sorted.

    Time Complexity = O(N^2)
    */

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } 
                else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    
}
