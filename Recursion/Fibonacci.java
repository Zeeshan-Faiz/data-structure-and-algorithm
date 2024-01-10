import java.util.Scanner;

public class Fibonacci {
    
    /*
     * Write a program to print the Fibonacci Number of nth term using recursion.
     * 
     * Example n = 5;
     * O/P = 5
     * Explanation : First 5 term of fibonacci series is = 1, 1, 2, 3, 5
     * Therefore the 5th term of the series = 5
     * 
     * Example n = 8;
     * O/P = 21
     * Explanation : First 8 term of fibonacci series is = 1, 1, 2, 3, 5, 8, 13, 21
     * Therefore the 8th term of the series = 21
     * 
    */

    /*
     * Approach :
     * Suppose we need to find the number in Fibonacci Series of 5th term = 4th term + 3rd term
     * or in a generic way we can write the same formula as nth term = (n-1) term + (n-2) term
     * 
     * And we all know that 1st term and 2nd term of a Fibonacci Series is always = 1
     * Therefore our base condition will be (n == 1) || (n == 2)
     * 
     * 
    */

    static int fibo(int n) {

        if ((n == 1) || (n == 2))
            return 1;

        return fibo(n-1) + fibo(n-2);
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

        System.out.println(fibo(n));

        sc.close();
    }

}
