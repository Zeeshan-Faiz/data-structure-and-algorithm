public class SkipCharacterInString {

    /*
     * Given a string, skip all the occurence of 'a' fromt it.
     * Ex str = "baccad"
     * O/P = "bccd"
    */

    //Approach 1 : Passing the ans string in the function argument
    static void skip(String ans, String str) {
        
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);

        if (ch == 'a') 
            skip(ans, str.substring(1));
        else 
            skip(ans + ch, str.substring(1));
    }

    //Approach 2 : Creating the ans string in the function body
    static String skip(String str) {
        
        if (str.isEmpty()) 
            return "";

        char ch = str.charAt(0);

        if (ch == 'a') 
            return skip(str.substring(1));
        else 
            return ch + skip(str.substring(1));
    }

    public static void main(String[] args) {
        
        //skip("","baccad");
        System.out.println(skip("baccad"));

    }
    
}
