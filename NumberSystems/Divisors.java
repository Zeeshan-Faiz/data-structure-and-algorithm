import java.util.Scanner;

public class Divisors {
    
    /*
     * Write a program to print all the divisors of a given number and print in ascending order
     * 
     * Example : number = 40
     * divisors of 40 = 1,2,4,5,8,10,20,40
     * 
     */


    /*
     * Approach 1 (Brute Force) : Run a for loop from 1 to the number and print all the
     * values of i that is a divisor of the given number.
     * 
     * Time Complexity = O(n) 
     */

    static void approach1(int n){

        for(int i = 1; i <= n; i++){

            if(n % i == 0)
                System.out.print(i + ", ");

        }
    }

    /*
     * Approach 2 (Optimized) : 
     * Example number = 40, --> (a x b) = 40
     * Then we can write as (1 x 40) , (2 x 20) , (4 x 10) , (5 x 8)
     * 
     * We'll use one for loop and run only until Square root of n to get the values of a
     * and do n/a to get value of b
     * 
     * Time Complexity = O(√n) + O(√n) = O(2√n) ==> O(√n)
     */

    static void approach2(int n){

        int i = 0;
        for(i = 1; i <= Math.sqrt(n); i++){

            if(n % i == 0)
                System.out.println(i + ", ");
        }

        for( ; i>= 1; i--){

            if(n % i == 0 && i != (n/i)) //taking care of duplicates if any   
                System.out.println(n/i);
        }

    } 


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

        approach1(n);

        sc.close();
    }

}
