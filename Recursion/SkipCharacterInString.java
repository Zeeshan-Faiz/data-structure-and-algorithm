public class SkipCharacterInString {

    /*
     * Given a string, skip all the occurence of 'a' fromt it.
     * Ex str = "baccad"
     * O/P = "bccd"
    */

    //Approach 1 : Passing the answer string in the function argument
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
    
}
