public class SkipCharacterInString {

    /*
     * Given a string, skip all the occurence of 'a' fromt it.
     * Ex str = "baccad"
     * O/P = "bccd"
    */

    //Approach 1 : Passing the ans string in the function argument
    static void skip1(String ans, String str) {
        
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);

        if (ch == 'a') 
            skip1(ans, str.substring(1));
        else 
            skip1(ans + ch, str.substring(1));
    }

    //Approach 2 : Creating the ans string in the function body
    static String skip2(String str) {
        
        if (str.isEmpty()) 
            return "";

        char ch = str.charAt(0);

        if (ch == 'a') 
            return skip2(str.substring(1));
        else 
            return ch + skip2(str.substring(1));
    }

    public static void main(String[] args) {
        
        //skip1("","baccad");
        System.out.println(skip2("baccad"));
    }
}
