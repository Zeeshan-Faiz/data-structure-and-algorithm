import java.util.ArrayList;

public class FindTargetInArray {
    
    /*
     * Given an integer array and a target element find the element in the array.
    */

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length)
            return false;
        
        return arr[index] == target || find(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) 
            return -1;
        
        if (arr[index] == target) 
            return index;
        else 
            return findIndex(arr, target, index + 1);
        
    }

    static int findIndexLast(int[] arr, int target, int index) {
        if (index == -1) 
            return -1;
        
        if (arr[index] == target) 
            return index;
        else 
            return findIndexLast(arr, target, index - 1);
        
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) 
            return;
        
        if (arr[index] == target) 
            list.add(index);
        
        findAllIndex(arr, target, index + 1);
    }

    public static void main(String[] args) {
        
        //System.err.println(find(new int[]{2,3,1,4,4,5}, 1, 0));
        //System.out.println(findIndex(new int[]{2,3,1,4,4,5}, 1, 0));
        //System.out.println(findIndexLast(new int[]{2,3,1,4,4,5}, 4, 5));

        findAllIndex(new int[]{2,3,1,4,4,5}, 4, 0);
        System.out.println(list);
    }
}
