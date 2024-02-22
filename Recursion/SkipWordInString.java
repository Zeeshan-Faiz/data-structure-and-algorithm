public class SkipWordInString {

    /*
     * Given a string, skip all the occurence of 'apple' fromt it and another function to remove app if there's no apple in the
     * given string.
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

    static String skipAppNotApple(String str) {

        if (str.isEmpty()) 
            return "";
        
        if (str.startsWith("app") && !str.startsWith("apple")) 
            return skipAppNotApple(str.substring(3));
        else 
            return str.charAt(0) + skipAppNotApple(str.substring(1));
    }

    public static void main(String[] args) {
        
        //System.out.println(skipApple("bcdapplefg"));
        System.out.println(skipAppNotApple("bcdapplfg"));
    }
}
