import java.util.Arrays;

public class MergeSortUsingRecursion {

    /*
     * Write a program to sort the given array using merge sort via Recursion.
    */

    static int[] mergeSort(int[] arr) {
       
        if (arr.length == 1) 
            return arr;

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }
    
}
