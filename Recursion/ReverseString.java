import java.util.Scanner;

public class ReverseString {
    
    /*
     * Write a program to input a String and reverse it using recursion.
     * Example str = abcd
     * O/P = dcba
     * 
    */

    /*
     * Approach : For finding the reverse of string we'll follow the recurrence relation:
     * reverseString(str, rev, i) = reverseString(str, rev + str.charAt(i), i-1)
     * 
     * and our base condition is (i < 0)
     * 
    */

    static String reverseString(String str, String rev, int i){

        if(i < 0)
            return rev;

        return reverseString(str, rev + str.charAt(i), i-1);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.next();

        System.out.println("Reverse of String " + str + " is : " + reverseString(str,"",str.length()-1));

        sc.close();
    }

}
