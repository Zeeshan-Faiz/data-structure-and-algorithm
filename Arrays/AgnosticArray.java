/*
You are given an ordered array not mentioning whether it is ordered in Ascending/Descending. Write a program to find
the target element in this array.
*/

public class AgnosticArray {

    static int agnosticArray(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        //check whether the given array is Ascending or Descending.
        boolean isAsc = arr[0] < arr[arr.length-1];
        if(isAsc){

        }
    }
    
}
