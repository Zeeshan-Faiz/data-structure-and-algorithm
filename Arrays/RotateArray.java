public class RotateArray {
    
    /*
     * Write a program to rotate the array by k times.
     * 
     * Example ar = {1,2,3,4,5} ; k = 3
     * O/P = {4,5,1,2,3}
    */

    /*
     * Approach 1 : If we see the rotated array with respect to the given k value we'll observe that after we reach the array length
     * the rotation matches the same as the previous k value.
     * k = 0 => {1,2,3,4,5}
     * k = 1 => {2,3,4,5,1}
     * k = 2 => {3,4,5,1,2}
     * k = 3 => {4,5,3,2,1}
     * k = 4 => {5,4,3,2,1}
     * k = 5 => {1,2,3,4,5}
     * k = 6 => {2,3,4,5,1}
     * k = 7 => {3,4,5,1,2}
     * ..........
     * 
     * For example k = 1 => {2,3,4,5,1} is same as k = 6 => {2,3,4,5,1}, similary 
     * k = 2 => {3,4,5,1,2} is same as k = 7 => {3,4,5,1,2}. A generic formula that we can define is 
     * (k % ar.length) will give the same rotated array irrespective of the value of k.
     * if k = 1 then (1%5) = 1 and if k = 6 then (6%5) =  1
     * which means for both k = 1 and k = 6, the rotated array will look same i.e {2,3,4,5,1}
     * 
     * and for negative values of k, we can use the formula
     * (k + ar.length) so if k = -1 then (-1 + 5) = 4 and for k = 4 both of will have the same rotated array
     * k = -1 => {5,4,3,2,1} is same as k = 4 => {5,4,3,2,1}
     * Time Complexity = O(k x n)
    */

    static void rotateByOne(int[] ar){

        int temp = ar[0];
        for(int i = 1; i < ar.length; i++){
            ar[i-1] = ar[i];
        }
        ar[ar.length - 1] = temp;
    }

    static void rotateApproach1(int[] ar, int k){

        k = k % ar.length;
        if(k < 0)
            k = k + ar.length;
        
        for(int i = 0; i <= k; i++)
            rotateByOne(ar);
    }

    public static void main(String[] args){

        int ar[] = {1,2,3,4,5};
        int k = 2;
        System.out.println("Array before rotating :");
        for(int i = 0; i < ar.length ; i++){
            System.out.print(ar[i] + " ");
        }

        rotateApproach1(ar, k);
        System.out.println("\nArray After rotating by " + k + " times :");
        for(int i = 0; i < ar.length ; i++){
                System.out.print(ar[i] + " ");
        }
    }
}
