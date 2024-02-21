public class FindTargetInRotatedArray {

    /*
     * Write a program to find the target elemnent in the rotated array using Recursion.
     * Ex arr = {5,6,7,1,2,3,4}, target = 4
     * O/P = 6
    */

    static int search(int[] arr, int target, int s, int e) {
        
        if (s > e) 
            return -1;

        int m = s + (e-s) / 2;
        if (arr[m] == target)
            return m;

        if (arr[s] <= arr[m]) {

            if (target >= arr[s] && target <= arr[m])
                return search(arr, target, s, m-1);
            else 
                return search(arr, target, m+1, e);
        }

        if (target >= arr[m] && target <= arr[e])
            return search(arr, target, m+1, e);

        return search(arr, target, s, m-1);
    }
    
}
