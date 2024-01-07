import java.util.Scanner;

public class CountSetBit {
    
    /*
     * Write a program to count the number of set bits in a given decimal number.
     * Example n = 43; 0 0 1 0 1 0 1 0
     * Count =  3
     * 
    */

    /*
     * Approach 1 (Brute Force) : Convert the given number into binary string array, traverse
     * the array and count the number of '1'
     * 
    */

    /*
     * Approah 2 (Efficient Approach) [Brian Kerniighan Algorithm]: We've noticed that
     * If we do AND operation between n & (n-1) the Right Most Set Bit is set to 0, similarly
     * if we iterate this process we'll be able to count the set bits with the number of 
     * iterations it took to make the given number as 0.
     * 
     * Time Complexity = O(Log N)
     * 
    */

    static void approach2(int n){

        int count = 0;
        while(n > 0){

            n = n & (n-1);
            count ++;
        }
        System.out.println("Count of set bits : "+count);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();

        System.out.println("Number in binary form :" + Integer.toBinaryString(n));
        approach2(n);
        
        sc.close();

    }

}
