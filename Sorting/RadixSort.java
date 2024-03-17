import java.util.Arrays;

public class RadixSort {
    
    /*
    Given an array, sort the array using Radix Sort.
    */

    public static void radixSort(int[] arr) {
    int max = Arrays.stream(arr).max().getAsInt();

    // do count sort for every digit place
    for(int exp = 1; max/exp > 0; exp *= 10) {
      countSort(arr, exp);
    }
  }
}