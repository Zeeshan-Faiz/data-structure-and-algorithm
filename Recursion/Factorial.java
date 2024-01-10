import java.util.Scanner;

public class Factorial {
    
    /*
     * Write a program to find the factorial of a given number N using recursion.
     * Example n = 5
     * O/P = 120
     * 
     * 5! = 5 x 4 x 3 x 2 x 1 = 120
     * 
    */

    /*
     * Approach :
     * To find the factorial of any number (n) we can have a generalize formula
     *  ==> n! = n x (n-1)!
     * 
     * And we know that 1! = 1, therefore our base condition will be (n == 1)
     * 
    */

    static int fact(int n){

        if(n == 1)
            return 1;
        
        return n * fact(n-1);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

        System.out.println("Factorial of " + n + " : " + fact(n));

        sc.close();
    }

}
