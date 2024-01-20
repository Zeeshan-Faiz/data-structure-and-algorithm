public class SubArray {
    
    /*
     * Write a program to print all the sub array of a given array.
     * 
     * Example ar = {1,2,3,4,5}
     * O/P = 1,12,123,1234,12345,2,23,234,2345,3,34,345,4,45,5 
    */

    /*
     * Approach : If we look closely into all the subarrays of {1,2,3,4,5} we can find a common pattern which can 
     * be seen below, here if we take two indexes i,j and start iterating over the array with respect to taking the boundary 
     * bewteen i and j we'll be able to get all the sub arrays.
     * 
     * i - j 
     * 0 - 0 (1)
     * 0 - 1 (1,2)
     * 0 - 2 (1,2,3)
     * 0 - 3 (1,2,3,4)
     * 0 - 4 (1,2,3,4,5)
     * 1 - 1 (2)
     * 1 - 1 (2,3)
     * 1 - 2 (2,3,4)
     * 1 - 3 (2,3,4,5)
     * 2 - 2 (3)
     * 2 - 3 (3,4)
     * 2 - 4 (3,4,5)
     * 3 - 3 (4)
     * 3 - 4 (4,5)
     * 4 - 4 (5)
    */

    static void subArray(int[] ar){
        
        for(int i = 0; i < ar.length; i++)
        {
            for(int j = i; j < ar.length; j++)
            {
                for(int k = i; k <= j; k++){
                    System.out.print(ar[k] + " ");
                }
            System.out.println();
            }
        }
    }

    public static void main(String[] args){

        int ar[] = {1,2,3,4,5};
        subArray(ar);
    }


}
