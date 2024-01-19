public class Reverse {
    
    /*
     * Write a program to reverse an array.
     * Example ar = {2,4,6,8,10,12,14}
     * O/P = {14,12,10,8,6,4,2}
    */

    static void reverse(int[] ar){

        int i = 0, j = ar.length - 1;
        while(i < j){

            int t = ar[i];
            ar[i] = ar[j];
            ar[j] = t;
            i++;
            j--;
        }
    }

    public static void main(String[] args){

        int ar[] = {2,4,6,8,10,12,14};
        System.out.println("Array before reversing :");
        for(int i = 0; i < ar.length ; i++){
            System.out.print(ar[i] + " ");
        }

        reverse(ar);
        System.out.println("\nArray After reversing :");
        for(int i = 0; i < ar.length ; i++){
            System.out.print(ar[i] + " ");
        }
        
    }


}
