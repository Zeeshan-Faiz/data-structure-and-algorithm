import java.util.Scanner;

public class BinaryRepresentOfNth {
    
    /*
     * Write a program to find the nth number whose binary representation is a palindrome.
     * NOTE : 
     * 1)Consider the first number whose binary representation is palindrome is 1 instead of 0
     * 2)Do not consider the leading zeroes while checking for palindrome
     * 
     * Example of palindrome binary sequence = 1, 11, 101, 111, 1001, 1111, 10001 .......
     * 
    */

    /*
     * Suppose we need to find the 21st palindromic binary sequence, here
     * n = 21, l = length of binary sequence, count = number of combinations that is possible
     * for the given length of sequence.
     *                                      (ℓ-1/2)
     * We can derive a formula for count = 2 
     * element (ele) = n - count - 1
     * 
     * Now to find l, we'll loop until our count becomes greater than the given number.
     * for n = 21, l = 6 (0 0 0 0 0 1 1 0)
     * to get half palindromic string for 21st number we can do,
     *    1 << (l-1) = 0 1 0 0 0 0 0 0 
     *  ele << (ℓ/2) = 0 0 1 1 0 0 0 0  (OR)
     *          ans  = 0 1 1 1 0 0 0 0
     * 
     * ans ==> 1 1 1 0 0 0 0 (half palindromic string generated)
     * 
     * Now to generate the full string we'll take ans and reverse and OR with itself
     * by doing this we'll get the palindromic sequest for nth number.
     * 
    */

    static void calPalindromicString(int n){

        int l = 0, count = 0;
        int temp = n;
        while(count < n){

            l++;
            count = count + (int)Math.pow(2, (l-1)/2);
        }

        count = count - (int)Math.pow(2, (l-1)/2); //going one combination back
        int ele = n - count - 1;

        int ans = (1 << (l-1)) | (ele << (l/2));

        ans = ans | reverseBinary(ans,l);

        System.out.println( temp + " Palindromic sequence : " + Integer.toBinaryString(ans));;

    }

    private static int reverseBinary(int ans, int len) {

        int f = len-1, l = 0;
        int rev = 0;

        while(f > l){

            if((ans & (1 << f)) != 0)
                rev = rev | (1 <<l);
            
            if((ans & (1 << l)) != 0)
                rev = rev | (1 << f);

        f--;
        l++;
        }

        return rev;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

        calPalindromicString(n);
        
        sc.close();
    }


}
