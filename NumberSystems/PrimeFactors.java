import java.util.Scanner;

public class PrimeFactors {
    
    /*
     * Write a program to print all the prime factors of a given number
     * 
     * Example = 900
     * Prime factors = 2,2,3,3,5,5
     * 
     */

    /*
     * Approach 1 (Brute Force) : Run a loop and print all the prime numbers that is a
     * divisor of the given number
     * 
     * Worst Case Time Complexity = O(n)
     * Because if the number provided is a prime number itself then no other number will 
     * be able to divide it except itself and hence O(n)
     */

     static void approach1(int n){

        int i = 2;
        while(n > 1){

            while(n % i == 0){
                
                System.out.print(i + ", ");
                n = n/i;
            }
            i++;
        }

    }

    /*
     * Approach 2 (Optimized) : We can observe that for any given number, if it has any
     * factors then these factors should always be less than or equal to √n
     * 
     * We'll write our code in such a way that if our loop variable i has surpassed √n
     * we'll directly assume that the given number is prime and we'll print the same number
     * as prime factor
     * 
     * Time Complexity = O(√n) . O(√n log n) ==> O(√n log n)
     */

    static void approach2(int n){

        int i = 2;
        while(i * i <= n){

            while(n % i == 0){

                System.out.print(i + ", ");
                n = n / i;
            }
            i++;
        }

        if(n > 1)
            System.out.print(n);

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

        //approach1(n);
        approach2(n);

        sc.close();
    }

}
