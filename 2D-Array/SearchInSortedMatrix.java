/*
Given a 2D matrix of nxn size whose both rows and columns are sorted Find the target element and return it's inddex.

Example arr[][] = {10, 20, 30, 40},
                  {15, 25, 35, 45},
                  {28, 29, 37, 49},
                  {33, 34, 38, 50}

target = 37

O/P = [2,2]
*/

import java.util.Arrays; 

public class SearchInSortedMatrix {

    /*
    Approach : We'll try to define a upper and lower bond with respect to column and row and if the tartget element
    is less than the last element of the 1st row in the matrix; we'll ignore that column and check to the left columns
    lese we'll check in the below rows.
    Time Complexity = O(n)
    */

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        System.out.println(Arrays.toString(search(arr, 49)));
    }
}
