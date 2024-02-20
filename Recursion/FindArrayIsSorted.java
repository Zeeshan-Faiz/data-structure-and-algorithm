public class FindArrayIsSorted {
    
    /*
     * Given an array find whether it's sorted or not using recursion.
    */

    static boolean sorted(int[] arr, int index) {
        
        if (index == arr.length - 1)
            return true;

        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }

    public static void main(String[] args) {
        
        System.out.println(sorted(new int[] {1, 2, 3, 5, 6, 8}, 0));
    }
}
