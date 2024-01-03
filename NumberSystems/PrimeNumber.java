import java.util.Scanner;

public class PrimeNumber {
    
    /*
     * Write a program to find whether the given number is prime or not
     * Example : 2,5,7,11,13.....(A prime number only has two factors 1 and itself) 
     * 
     */

     /*
      *Approach 1 (Brute Force) : We'll run a for loop and check whether the provided number
      * has any factor other than 1 or itself
      * If yes its not a prime number otherwise the number is prime
      * 
      * Time Complexity = O(n)  
      
      * As we know that for any number the first factor will be always less than
      * or equal to square root of that number. In that case we can have our loop condition
      * (i <= Math.sqrt(n))
      * By doing this our Time Complexity will change to : O(√n)
      */

    static boolean approach1(int n){

        for(int i = 2; i <= n/2 ; i++){
            if(n % i == 0)
                return false;
        }

        return true;
    }

    /*
     * Approach 2 (Optimized) : If we observe number lines who all are prime numbers there are 
     * several observations we can make:
     * All 2's and 3's multiple can't be prime
     * 1 is not a prime number
     * The first prime number other than 2 and 3 starts from (5,7,11,13,17,19.........)
     * Each of these pairs(5,7) or (11,13) or (17,19) has a difference of 2
     * And between each pairs we have a difference of 6 (5,11) or (11,17) or (17,23)
     * 
     * We can hereby use this findings and can come up with a more optimized code
     * Time Complexity : O(√n) (which is better than previous approach as we'll be iterating by 6)
     */


    static boolean approach2(int n){

        if(n == 1)
            return false;

        if(n == 2 || n == 3)
            return true;
        
        if(n % 2 == 0 || n % 3 == 0)
            return false;

        for(int i = 5; i <= Math.sqrt(n); i = i + 6){
            if(n % i == 0 || n % (i+2) == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

        //System.out.println("Is the number " + n + " Prime? " + approach1(n));
        System.out.println("Is the number " + n + " Prime? " + approach2(n));
    }

}
