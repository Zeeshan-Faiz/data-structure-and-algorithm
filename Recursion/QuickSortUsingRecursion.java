public class QuickSortUsingRecursion {

    /*
     * Write a program to sort the given array using Quick Sort via Recursion.
    */

    static void sort(int[] nums, int low, int hi) {
        
        if (low >= hi)
            return;

        int s = low, e = hi, m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s <= e) {

            while (nums[s] < pivot) 
                s++;
    
            while (nums[e] > pivot) 
                e--;

            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        // now the pivot is at correct index, sort two halves now
        sort(nums, low, e);
        sort(nums, s, hi);
    }
    
}
