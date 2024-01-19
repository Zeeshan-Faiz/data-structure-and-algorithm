public class RemoveDuplicates {
    
    /*
     * Write a program to remove duplicates from the given array.
     * Example ar = {2,2,3,3,4,6,6}
     * O/P = {2,3,4,6}
    */

    /*
     * Approach 1(Brute Force) : We'll be using an auxiliary array to store the array elements with no duplicates.
     * ar = {2,2,3,3,4,6,6} ; temp = {2,3,4,6}.
     * We'll be having two array indexes one i which will iterate over the given array and the other one as rd
     * which will iterate over the temporary to store non-duplicate values.
    */

    static void approach1(int[] ar){

        int[] temp = new int[ar.length];
        int rd = 0;
        temp[rd] = ar[0];
        for(int i = 1; i < ar.length; i++){
            if(temp[rd] != ar[i]){
                rd++;
                temp[rd] = ar[i];
            }
        }
    }


}
