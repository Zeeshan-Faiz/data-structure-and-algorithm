public class MoveZeroes {
    
    /*
     * Write a program to move all the zeroes to the end of an array while maintaining the relative order of the
     * non-zero elements.
     * 
     * Example ar = {0,10,22,8,0,5,0}
     * O/P = {10,22,8,5,0,0}
    */

    /*
     * Approach : We'll be having two variables nz and z pointing to non-zero and zero elements respectively.
     * we'll iterate over the array and if we get any 0 element we'll swtich that element by the next non-zero
     * element.
    */

    static void moveZeroes(int[] ar){

        if(ar.length == 0 || ar.length == 1)
            return;

        int nz = 0, z = 0;
        while(nz < ar.length){
            
            if(ar[nz] != 0){
                int temp = ar[nz];
                ar[nz] = ar[z];
                ar[z] = temp;
                nz++;
                z++;
            }
            else
            nz++;
        }
        
    }

    public static void main(String[] args){

        int ar[] = {0,10,22,8,5,0};
        System.out.println("Array before moving zeroes :");
        for(int i = 0; i < ar.length ; i++){
            System.out.print(ar[i] + " ");
        }

        moveZeroes(ar);
        System.out.println("\nArray After moving zeroes at the end:");
        for(int i = 0; i < ar.length ; i++){
            System.out.print(ar[i] + " ");
        }
    }


}
