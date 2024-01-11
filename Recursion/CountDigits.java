import java.util.Scanner;

public class CountDigits {
    
    /*
     * Write a program to input a number and count the number of digits using recursion.
     * Example n = 12345
     * O/P = 5
     * 
    */

    /*
     * Approach : For counting the number of digits we'll follow the recurrence relation:
     * countDigits(n) = countDigits(n/10) + 1
     * 
     * and our base condition is (n == 0)
     * 
    */

    static int countDigits(int n){

        if(n == 0) 
            return 0;

        return countDigits(n/10) + 1;

    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

        System.out.println("Number of digits in " + n + " : " + countDigits(n));

        sc.close();
    }



}
