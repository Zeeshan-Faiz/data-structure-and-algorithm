/*
You are given an ordered array not mentioning whether it is ordered in Ascending/Descending. Write a program to find
the target element in this array.
*/

public class AgnosticBinarySearch {

    static int agnosticArray(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        //check whether the given array is Ascending or Descending.
        boolean isAsc = arr[0] < arr[end];
        
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == target)
                return mid;
            
            if(isAsc){
                if(arr[mid] < target)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
            else{
                if(arr[mid] > target)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        System.out.println(agnosticArray(new int[] {9,7,5,3,1}, 1));
    }
}
