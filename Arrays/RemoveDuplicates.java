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
     * which will iterate over the temporary array to store non-duplicate values.
    */

    static int rd = 0;
    static int[] approach1(int[] ar){

        int[] temp = new int[ar.length];
        
        temp[rd] = ar[0];
        for(int i = 1; i < ar.length; i++){
            if(temp[rd] != ar[i]){
                rd++;
                temp[rd] = ar[i];
            }
        }
        return temp;
    }

    public static void main(String[] args){

        int ar[] = {0,0,2,2,3,3,4,6,6};
        System.out.println("Array before removing duplicates :");
        for(int i = 0; i < ar.length ; i++){
            System.out.print(ar[i] + " ");
        }

        int[] temp = approach1(ar);
        System.out.println("\nArray After removing duplicates :");
        for(int i = 0; i <= rd ; i++){
                System.out.print(temp[i] + " ");
        }
    }


}
