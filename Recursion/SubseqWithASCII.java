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

    public static void main(String[] args) {
        
        subseqAscii("", "ab");
    }
    
}
