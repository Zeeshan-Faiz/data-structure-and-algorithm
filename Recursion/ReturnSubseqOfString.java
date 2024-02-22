public class ReturnSubseqOfString {

    /*
     * Given a string return all of it's subsets.
     * Ex str = "abc"
     * O/P = ["a","b","c","ab,"bc","ac","abc",""]
    */
    
    //Approach 1 : Passing the ans in the method argument
    static void subseq(String ans, String str) {
        
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);

        //pick a character
        subseq(ans + ch, str.substring(1));

        //don't pick the character
        subseq(ans, str.substring(1));
    }

    
}
