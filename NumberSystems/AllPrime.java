import java.util.Scanner;

public class AllPrime {
    
    /*
     * Write a program to print all the prime numbers between 1 to n.
     * Example n = 50
     * Output = 2,3,5,7,11,13,17,19,23,29,31,37,41,43,47
     * 
     */

     /*
      * Approach 1 (Brute Force) : 
      * We already have a function in the previous code to check whether a number is prime
      * or not. We can use the checkPrime() method and find all prime numbers between 1
      * and n
      * Time Complexity = O(n√n)
      */

      static boolean checkPrime(int n){

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

    static void approach1(int n){

        for(int i = 1; i <= n; i++){
            if(checkPrime(i))
                System.out.print(i + ", ");
        }
    }


    /*
     * Approach 2 [Sieve of Eratosthenes](Optimized) : The idea behind this algorithm is that if we'll try 
     * to mark all the multiples starting from 2 then 3 and so on. 
     * All the unmarked numbers until the number n, are prime numbers.
     * We'll be using an empty boolean array to track the prime numbers as unmarked(false)
     * 
     * Time Complexity = O(√n log (log n)) ~ O(√n)
     */

    static void approach2(int n){

        boolean trackPrime [] = new boolean[n+1];

        for(int i = 2; i <= Math.sqrt(n); i++){
            
            if(trackPrime[i] == false){
                
                for(int j = i * i; j <= n; j = j + i){
                    trackPrime[j] =  true;
                }
            }

        }

        for(int i = 2; i <= n; i++){
            if(trackPrime[i] == false)
                System.out.print(i + ", ");
        }

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

        //approach1(n);
        approach2(n);
    }

}
