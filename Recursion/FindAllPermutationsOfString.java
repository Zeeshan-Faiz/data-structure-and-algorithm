import java.util.ArrayList;

public class FindAllPermutationsOfString {
    
    /*
     * Given a string find all of it's permutations.
     * Ex str = "abc"
     * O/P = [cba, bca, bac, cab, acb, abc]
    */

    //Approach 1 : Printing the ans directly after the recusrive call ends
    static void permutations(String ans, String str) {
        
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);

        //for every call we'll have different positions to put our current character.
        // given ba and current ch = c; we can have cba OR bca OR bac
        //this will take care for all the possible places that the current character can be put
        for (int i = 0; i <= ans.length(); i++) {
            String f = ans.substring(0, i);
            String s = ans.substring(i, ans.length());
            permutations(f + ch + s, str.substring(1));
        }
    }

    //Approach 2 : Add all the ans in an ArrayList and then return the list
    static ArrayList<String> permutationsList(String ans, String str) {
        
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> res = new ArrayList<>();

        for (int i = 0; i <= ans.length(); i++) {
            String f = ans.substring(0, i);
            String s = ans.substring(i, ans.length());
            res.addAll(permutationsList(f + ch + s, str.substring(1)));
        }
        return res;
    }

    public static void main(String[] args) {
        
        //permutations("", "abc");
        System.out.println(permutationsList("", "abc"));
    }
}