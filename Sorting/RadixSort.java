import java.util.Arrays;

public class RadixSort {

    /*
     * Given an array, sort the array using Radix Sort.
     */

    public static void radixSort(int[] arr) {
        
        int max = Arrays.stream(arr).max().getAsInt();

        // do count sort for every digit place
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }

    private static void countSort(int[] arr, int exp) {
        
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];//as each digit in a number contains only between 0-9

        //Count the frequency of each digit
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        //update the count array
        for (int i = 1; i < 10; i++) {
            count[i] = count[i] + count[i - 1];
        }

        //update the output array and place original array elements to this output array for each base
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
    }
}