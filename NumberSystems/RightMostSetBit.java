import java.util.Scanner;

public class RightMostSetBit {

    /*
     * Write a program to find the position of the right most set bit.(A set bit is a bit
     * whose value is 1)
     * Example: n = 10 ; 0 0 0 0 1 0 1 0 
     *                              ⬆️(RMSB)
    */

    /*
    * Approach 1 (Brute Force) : Iterate each bit from last and return the first bit's position
    * which is set as 1 
    */

    /*
     * Approach 2 (Better Approach) : We'll start using mask of 1 and do AND operation with
     * the given number. If the operation gives zero then we'll change our mask to 2 and do
     * AND opration with the number and we'll do the same steps until we get the RMSB
     * 
     * Time Complexity = O(log N)
     * 
    */

    static int approach2(int n){

        int mask = 1;
        int pos = 0;

        if(n == 0)
            return -1;

        while((n & mask) == 0){

            mask = mask << 1;
            pos += 1;

        }
        return pos+1;
    }

    /*
     * Approach 3 (Most Optimized) : Second approach also uses iteration to get the RMSB,
     * we'll now try to find a mask and a operation such that there's no need of loop.
     * We'll take mask of (n-1) and then do AND operation with the number
     * and then do XOR operation with the given number and the product of previous operation.
     * 
     * Example n = 40; 0 0 1 0 1 0 0 0 
     *   (n - 1) = 39; 0 0 1 0 0 1 1 1
     * We'll do (n & (n - 1)) ==> 0 0 1 0 0 0 0
     * 
     * We'll then do XOR(^) operation on the number and the given product
     * (n ^ (n & (n - 1))) ==> 0 0 0 0 1 0 0 0
     * 
     * We got the bit which contains only the RMSB but we need to convert it into its 
     * equivalent position for that we'll use log10.
     * 
     * Time Complexity = O(1)
    */

    static int approach3(int n){

        return (int) ((Math.log10(n ^ (n & (n-1)))) / Math.log10(2)) + 1;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();

        //int position = approach2(n);
        int position = approach3(n);

        if(position >= 0)
            System.out.println("Position of the Right Most Set Bit is " + position);

        else
            System.out.println("There's no RMSB for the given number " +  n);
        
        sc.close();

    }

}