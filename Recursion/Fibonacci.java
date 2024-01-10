import java.util.Scanner;

public class Fibonacci {
    
    /*
     * Write a program to print the Fibonacci Number of nth term using recursion.
     * 
     * Example n = 5;
     * O/P = 1, 1, 2, 3, 5
     * 
     * Example n = 8;
     * o/P = 1, 1, 2, 3, 5, 8, 13, 21
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
