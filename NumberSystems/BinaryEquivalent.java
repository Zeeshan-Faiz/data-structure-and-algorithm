import java.util.Scanner;

public class BinaryEquivalent {
    
    /*
     * Write a program to input a number and print it's binary equivalent
     * Example n1 = 7
     * O/P = 111
     * 
     * Example n2 = 13
     * O/P = 1101
     */

    static void decToBinary(int n){

        String binary = "";
        while(n >= 1){

            int x = n % 2;
            binary = x + binary;
            n = n/2;
        }
        System.out.println(binary);

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

        decToBinary(n);
        sc.close();

    }

}
