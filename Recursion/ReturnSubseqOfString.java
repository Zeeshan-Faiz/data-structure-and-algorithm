import java.util.ArrayList;

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

    //Approach 2 : Creating a list of String and then returning the same list
    static ArrayList<String> subseqRet(String ans, String str) {
        
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch = str.charAt(0);

        //pick a character
        ArrayList<String> left = subseqRet(ans + ch, str.substring(1));

        //don't pick the character
        ArrayList<String> right = subseqRet(ans, str.substring(1));

        //merge both the parts of the lists
        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        
        subseq("", "abc");
    }

    
}
