public class SubArray {
    
    /*
     * Write a program to print all the sub array of a given array.
     * 
     * Example ar = {1,2,3,4,5}
     * O/P = 1,12,123,1234,12345,2,23,234,2345,3,34,345,4,45,5 
    */

    /*
     * Approach : To print all the sub arary we can follow a simple logic:
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
     *  
     * 
     * 
     * 
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
