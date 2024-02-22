public class SkipWordInString {

    /*
     * Given a string, skip all the occurence of 'apple' fromt it.
     * Ex str = "bcdapplefg"
     * O/P = "bcdfg"
    */

    static String skipApple(String str) {

        if (str.isEmpty()) 
            return "";
        
        if (str.startsWith("apple")) 
            return skipApple(str.substring(5));
        else 
            return str.charAt(0) + skipApple(str.substring(1));
        
    }
    
}
