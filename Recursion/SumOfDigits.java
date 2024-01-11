import java.util.Scanner;

public class SumOfDigits {
    

    /*
     * Write a program to input a number and find the sum of digits using recursion.
     * Example n = 5251
     * O/P = 13
     * 
    */

    /*
     * Approach : For counting the number of digits we'll follow the recurrence relation:
     * sumOfDigits(n) = sumOfDigits(n/10) + (n%10)
     * 
     * and our base condition is (n == 0)
     * 
    */

    static int sumOfDigits(int n){

        if(n == 0)
            return 0;

        return sumOfDigits(n/10) + (n%10);
    }



    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

        System.out.println("Sum of digits of " + n + " : " + sumOfDigits(n));

        sc.close();
    }

}
