public class CountAllPermutationOfString {

    /*
     * Write a program to find the total count of all the permutations possible for a give string.
     * Ex str = "abc"
     * O/P = 6
    */

    static int permutationsCount(String ans, String str) {
        
        if (str.isEmpty()) 
            return 1;
        
        int count = 0;
        char ch = str.charAt(0);
        for (int i = 0; i <= ans.length(); i++) {
            String f = ans.substring(0, i);
            String s = ans.substring(i, ans.length());
            count = count + permutationsCount(f + ch + s, str.substring(1));
        }
        return count;
    }
    
}