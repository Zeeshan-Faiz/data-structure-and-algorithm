import java.util.Scanner;

public class CheckPowerOf2 {
    
    /*
     * Write a program to check whether a given number is a power of 2 or not.
     * Example n = 8
     * O/P = YES
     * 
     * n = 20 
     * O/P = NO
     * 
    */

    /*
     * Approach 1 (Brute Force) : We'll take 2 and check whether it's equal to tge given number
     * if YES then it's power of 2 otherwise we'll make 2 x 2 and check for the same, if the value of
     * 2 goes beyond the given number and still it wasn't able to divide the given number 
     * we'll directly print 'NO'
     * 
    */

    /*
     * Approach 2 (Optimized Approach) [Brian Kernighan's Algorithm] : If n & (n - 1)
     * gives 0 then we can directly conclude that the given number was indeed a power of 2.
     * Because all the power of 2's in binary has only 1 set bit.
     * 2 = 0 0 0 0 0 0 1 0
     * 4 = 0 0 0 0 0 1 0 0
     * 8 = 0 0 0 0 1 0 0 0
     * ..........
     * 
     * Time Complexity = O(1)
     * 
    */

    static boolean approach2(int n){

        if(n == 0)
            return false;
        else
            return (n & (n - 1)) == 0; // true only if 1 bit is set to 1

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();

        System.out.println("Is the given number " + n + " a power of 2 ? " + approach2(n));

        sc.close();
    }

}
