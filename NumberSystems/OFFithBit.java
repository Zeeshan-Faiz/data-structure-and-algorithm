import java.util.Scanner;

public class OFFithBit {
    
    /*  
     * Write a program to input a number to switch OFF the ith bit in it's binary equivalent
     * Example (n=36) = 0 0 1 0 0 1 0 0 
     *                      i    
     *            O/P = 0 0 0 0 0 1 0 0
     * 
     * Approach : There are two approaches that we can follow to get the desired output,
     * first is to convert the given number in binary and then find the ith element and
     * make it i(OFF)
     * 
     * Secondly we can use bit manipulation using Bitwise Operations to get the required
     * result.
     * 
     * if n = 36 and i = 5
     * then,
     * we'll create a mask using 1 and shift left with the position of i (i.e 5) and
     * we'll use ~ (negation operation to our mask)
     * and do AND opertion with n.
     * Automatically by doing this our ith bit will switch OFF. 
     */

    static void switchOff(int n, int i){

        System.out.println("Binary Equivalent of " + n + " = " + Integer.toBinaryString(n));
        int mask = ~(1 << i);

        System.out.println("Switching ON " + i + " position = " + Integer.toBinaryString(n & mask));

    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
        System.out.println("Enter the position you want to switch OFF");
        int i = sc.nextInt();

        switchOff(n,i);
        sc.close();

    }
    
}
