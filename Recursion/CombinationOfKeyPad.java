import java.util.ArrayList;

public class CombinationOfKeyPad {

    /*
     * Write a program to find the letter comibnations that can be generated by
     * pressing the digits
     * of a keypad starting from 1 - 9.
     * Ex = "12"
     * O/P = [ad, ae, af, bd, be, bf, cd, ce, cf]
     */

    // Approach 1 : Printing the ans directly after the recusrive call ends
    static void pad(String ans, String str) {

        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        int digit = str.charAt(0) - '0'; // this will convert '2' into 2

        // for any given digit suppose 2 (we'll formulate range = [digit - 1 * 3], digit
        // * 3) = [3,6] = 'a' + 3 = d, 'a' + 4 = e, 'a' + 5 = f
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            pad(ans + ch, str.substring(1));
        }
    }

    // Approach 2 : Add all the ans in an ArrayList and then return the list
    static ArrayList<String> padRet(String ans, String str) {
        
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        int digit = str.charAt(0) - '0'; // this will convert '2' into 2

        ArrayList<String> res = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            res.addAll(padRet(ans + ch, str.substring(1)));
        }
        return res;
    }

    public static void main(String[] args) {

        //pad("", "12");
        System.out.println(padRet("", "12"));
    }
}