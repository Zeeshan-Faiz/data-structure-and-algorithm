import java.util.Scanner;

public class CheckPalindrome {
    
    /*
     * Write a program to input a string and print whether it's a palindrome or not using recursion.
     * Examle str = madam
     * O/P = true
     * 
     * Example str = abcd
     * O/P = false
     * 
    */

    /*
     * Suppose we take example of madam then,
     * we'll have two different indexes i and j both pointing to the starting and ending
     * characters of the given string.
     *  i   j
     *  madam
     * 
     * we'll check if starting and ending characters of the given string 
     * is equal or not if yes we'll continue incrementing i and decrementing j,
     * otherwise we'll directly return false.
     * 
     * In this scenario our base condition will be (j <= i)
     * 
    */

    static boolean isPalindrome(String str, int i, int j){

        if(str.charAt(i) != str.charAt(j))
            return false;

        if(j <= i)
            return true;

        return isPalindrome(str, i+1, j-1);

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.next();

        System.out.println("Is the given string palindrome ? "+isPalindrome(str,0,str.length()-1));

        sc.close();
    }

}
