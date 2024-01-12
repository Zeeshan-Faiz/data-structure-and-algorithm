import java.util.ArrayList;
import java.util.Scanner;

public class Subsequence {
    
    /*
     * Write a program to find all the subsequence of a given string.
     * A subsequence of a given string is a sequence that can be derived from the given
     * string by deleting some or no elements without changing the order of the remaining
     * elements.
     * 
     * Example str = "abc"
     * O/P = {abc,bc,ac,ab,a,b,c, }
     * 
    */

    /*
     * To find the Number of subsequences in a given string = 2^(length of String) => 2^3 = 8
     * 
     * Suppose instead of generating the subsequence of "abc" we'll directly pick c first
     * c --> _ , c
     * then we'll pick b as well
     * bc --> _ , c , b , bc
     * then we'll pick a at last
     * abc --> _ , c , b , bc , a , ac , ab , abc 
     * 
     * Similary we'll start from selecting only c and find it's subsequence then bc and find it's subsequence
     * and at last we'll pick abc and find all of it's subsequences using recursion.
     * 
     * Base condition : if(str.length == 0)
    */

    static ArrayList<String> al = new ArrayList<>();

    static void getSequence(String str, String ans){

        if(str.length() == 0){
            al.add(ans);
            return;
        }
            
        //pick
        getSequence(str.substring(1), ans + str.charAt(0));

        //not picl
        getSequence(str.substring(1), ans);

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String for which you want the subsequences : ");
		String str = sc.next();

        getSequence(str, "");
        System.out.println("Subsequence of String " + str + " is : " + al);

        sc.close();
    }


}
