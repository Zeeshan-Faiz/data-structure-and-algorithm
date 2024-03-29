/*
LeetCode Q645 (Difficulty = Easy)
You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one 
of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of 
another number.
You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]

Example 2:
Input: nums = [1,1]
Output: [1,2]
*/

import java.util.Arrays;

public class SetMismatch {

    static int[] findErrorNums(int[] nums) {
        
        //Apply cyclic sort and sort the array elements
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i , correct);
            } else {
                i++;
            }
        }

        //find both duplicate & missing numbers
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {
                return new int[] {nums[index], index+1};
            }
        }
        return new int[] {-1,-1};
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        
        int[] arr = {2,1,4,2,6,5};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
}
