import java.util.ArrayList;

public class SubseqWithASCII {

    /*
     * Given a string, print all of it's subsequences along with it's ASCII values.
     * Ex str = "ab"
     * O/P = [ab,a,a98,b,98,97b,97b,9798, ]
    */

    //Approach 1 : passing the ans in the method argument
    static void subseqAscii(String ans, String str) {
        
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);

        //pick a character
        subseqAscii(ans + ch, str.substring(1));

        //don't pick the character
        subseqAscii(ans, str.substring(1));

        //take only ASCII values
        subseqAscii(ans + (ch+0), str.substring(1));
    }

    //Approach 2 : Creating a list of String and then returning the same list
    static ArrayList<String> subseqAsciiRet(String ans, String str) {
        
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = str.charAt(0);

        //pick a character
        ArrayList<String> first = subseqAsciiRet(ans + ch, str.substring(1));

        //don't pick the character
        ArrayList<String> second = subseqAsciiRet(ans, str.substring(1));

        //pick the ASCII value
        ArrayList<String> third = subseqAsciiRet(ans + (ch+0), str.substring(1));

        //add all the three lists
        first.addAll(second);
        first.addAll(third);
        return first;
    }

    public static void main(String[] args) {
        
        //subseqAscii("", "ab");
        System.out.println(subseqAsciiRet("", "ab"));
    }
}
