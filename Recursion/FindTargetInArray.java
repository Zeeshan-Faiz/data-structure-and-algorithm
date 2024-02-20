public class FindTargetInArray {
    
    /*
     * Given an integer array and a target element find the element in the array.
    */

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }
}
