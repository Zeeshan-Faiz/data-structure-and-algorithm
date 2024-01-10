import java.util.Scanner;

public class PrintNnumbers {
    
    /*
     * Write a program to print the first N natural numbers using recursion
     * Example n = 5
     * O/P =  1 2 3 4 5
     * 
    */

    /*
     * Approach : As it's a quite simple question to print the first N natural numbers we can have printN(n) = printN(n-1)
     * We know that Natural Number starts from 1, so our base condition will be (n == 0)
     * 
    */

    static void printN(int n){

        if(n == 0)
            return;
        
        printN(n-1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
        System.out.println("--------------");

        printN(n);

        sc.close();
    }

}
