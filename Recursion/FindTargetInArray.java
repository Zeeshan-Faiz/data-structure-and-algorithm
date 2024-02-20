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

    public static void main(String[] args) {
        
        //System.err.println(find(new int[]{2,3,1,4,4,5}, 1, 0));
    }
}
