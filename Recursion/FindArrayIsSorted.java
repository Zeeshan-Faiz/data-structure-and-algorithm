public class FindArrayIsSorted {
    
    /*
     * Given an array find whether it's sorted or not using recursion.
    */

    static boolean sorted(int[] arr, int index) {
        
        if (index == arr.length - 1)
            return true;

        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }
}
