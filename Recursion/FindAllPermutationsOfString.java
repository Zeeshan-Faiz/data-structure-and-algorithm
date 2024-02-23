public class FindAllPermutationsOfString {
    
    /*
     * Given a string find all of it's permutations.
     * Ex str = "abc"
     * O/P = [abc,bac,cab,bca,acb,cba]
    */

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

    public static void main(String[] args) {
        
        permutations("", "abc");
    }
}
