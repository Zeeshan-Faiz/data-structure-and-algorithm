public class InverseOfArray {

    /*
     * Write a program to print the inverse of a given array. Inverse of an array is when the array indexes is placed
     * according to it's index value or in simple statement whatever is the index becomes the value in the next array.
     * 
     * Example ar = {2,3,1,0,4}
     * O/P = {3,2,0,1,4}
    */

    /*
     * Approach : Our aim is to inverse the array, so 
     *                          0 1 2 3 4
     * if the given array ar = {2,3,1,0,4}
     * so the new array will contain the values whatever the index has of the first array, 
     * suppose ar[0] = 2 then second array br[2] = 0
     * similarly ar[1] = 3 then br[3] = 0 and so on.
    */

    static int[] inverseOfArray(int[] ar){

        int[] br = new int[ar.length];

        for(int i = 0; i < ar.length; i++){
            int value = ar[i];
            br[value] = i;
        }

        return br;
    }

    public static void main(String[] args){

        int ar[] = {2,3,1,0,4};
        System.out.println("Array before inversing :");
        for(int i = 0; i < ar.length ; i++){
            System.out.print(ar[i] + " ");
        }

        int[] br = inverseOfArray(ar);
        System.out.println("\nArray after inversing :");
        for(int i = 0; i < br.length ; i++){
            System.out.print(br[i] + " ");
        }



    }
    
}
