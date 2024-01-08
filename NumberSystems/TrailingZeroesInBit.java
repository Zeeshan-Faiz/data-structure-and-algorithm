import java.util.Scanner;

public class TrailingZeroesInBit {
    
    /*
     * Write a program to input a number and find the number of trailing zeroes in its binary 
     * representation.
     * Example n = 168; 1 0 1 0 1 0 0 0
     * Number of trailing zeroes = 3
     * 
     * Example n = 128; 1 0 0 0 0 0 0 0
     * Number of trailing zeroes = 7
     * 
    */

    /* 
     * We could observe that we need to count the number of trailing zeroes after the 
     * Right Most Set Bit (RMSB). For that we'll try to find the RMSB using the already
     * known formula ==> (n & (n-1)) = mask ==> n ^ mask
     * which can be formulated as = (n ^ (n & (n-1))))
     * gives the position of the RMSB which in other hand will give us the
     * number of trailing zeroes.
     * 
    */

    static int countTrailingZeroes(int n){

        return (int) ((Math.log10(n ^ (n & (n-1)))) / Math.log10(2));
    }

    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		int noOfZeroes = countTrailingZeroes(n);
		System.out.println("Number of trailing zeroes in " + Integer.toBinaryString(n) + " is : " + noOfZeroes);

		sc.close();
	}

}
