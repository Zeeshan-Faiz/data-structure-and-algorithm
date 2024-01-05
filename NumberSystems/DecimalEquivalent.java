import java.util.Scanner;

public class DecimalEquivalent {
    
    /*
     * Write a program to convert binary to decimal
     * Example bin = 111
     * O/P = 7
     * 
     */

    static void binToDecimal(String bin){   

        int res = 0;
        int powerOf2 = 1;
        for(int i = bin.length()-1; i >= 0; i--){

            if(bin.charAt(i) == '1')
                res = res + powerOf2;

            powerOf2 = powerOf2 * 2;
        }

        System.out.println(res);

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number in binary: ");
		String n = sc.next();

        binToDecimal(n);
        sc.close();

    }


}
