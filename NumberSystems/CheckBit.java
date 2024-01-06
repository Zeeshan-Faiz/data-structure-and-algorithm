import java.util.Scanner;

public class CheckBit {
	
    /*
     * Write a program to input a number and check the ith bit is ON or OFF in it's binary equivalent
     * Example (n=36, i=5) = 0 0 1 0 0 1 0 0  
     *                           i    
     *                 O/P = ON  
     * 
     * Approach : There are two approaches that we can follow to get the desired output,
     * first is to convert the given number in binary and then find the ith element and
     * check whether it's ON or OFF
     * 
     * Secondly we can use bit manipulation using Bitwise Operations to get the required
     * result.
     * 
     * if n = 36 and i = 5
     * then,
     * we'll create a mask using 1 and shift left with the position of i (i.e 5)
     * and do AND opertion with n.
     * If the output is 0 then bit is OFF
     * else the bit is ON 
     */


    static void checkBit(int n, int i){

        System.out.println("Binary Equivalent of " + n + " = " + Integer.toBinaryString(n));
        int mask = 1 << i;

        int value = n & mask;

        if(value == 0)
            System.out.println("The given bit is OFF");
        else
            System.out.println("The given bit is ON");
    
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
        System.out.println("Enter the position you want to check for ");
        int i = sc.nextInt();

        checkBit(n,i);
        sc.close();

    }

}
