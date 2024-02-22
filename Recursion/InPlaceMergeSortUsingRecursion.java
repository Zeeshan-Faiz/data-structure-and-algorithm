public class InPlaceMergeSortUsingRecursion {

    /*
     * Write a program to sort the given array using In Place Merge Sort technique via Recursion.
    */

    static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s == 1)
            return;

        int mid = (s + e) / 2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }
    
}
