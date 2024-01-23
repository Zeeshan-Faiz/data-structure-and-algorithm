public class SearchElement {
    
    /*
     * Write a program to seach for an element in mxn matrix. NOTE: Integers in each row of the matrix are sorted
     * in ascending order from left to right and Integers in each column are sorted in ascending order from top to
     * bottom of the matrix.
     * Return true or false depending whether the target element is present in the matrix or not.
     * 
     * Example ar = {{1,4,7,11,15},
     *              {2,5,8,12,19},
     *              {3,6,9,16,22},
     *              {10,13,14,17,24},
     *              {18,21,23,26,30}}       target = 5
     * 
     * O/P = true
    */

    /*
     * Approach 1 (Brute Force) : Check for target element by traversing all the elements of the matrix.
     * 
     * Time Complexity = O(mxn)
    */

    static boolean searchElement1(int[][] ar, int target){

        for(int i = 0; i < ar.length; i++){
            for(int j = 0; j < ar[i].length; j++){
                if(ar[i][j] == target)
                    return true;
            }
        }
        return false;
    }

    /*
     * Approach 2 (Optimized) : Instead of traversing the whole matrix to check for the target element as we know
     * that each row and column of the matrix are sorted in ascending order we,ll start searching for the target element
     * from last element of the 1st row i.e 15.
     * If the target element is smaller than 15 we'll move one column backward(j--) otherwise we'll move one row forward(i++)
     * 
     * Time Complexity = O(m+n)
    */

    static boolean searchElement2(int[][] ar, int target){

        int i = 0, j = ar.length-1;
        while(i < ar.length && j >= 0){
            
            if(ar[i][j] == target)
                return true;
            else if(target < ar[i][j])
                j--;
            else
                i++;
        }
        return false;
    }

    public static void main(String[] args){

        int ar[][] ={{1,4,7,11,15},
                      {2,5,8,12,19},
                      {3,6,9,16,22},
                      {10,13,14,17,24},
                      {18,21,23,26,30}};

        System.out.println(searchElement2(ar,5));
    }
}
