public class KarpRabinPatternSearch {

    /*
     * Given two strings text and a pattern, find whether the pattern exists in the given text or not.
    */

    private final int PRIME = 101;

    // calculate the hash value of given string
    private double calculateHash(String str) {
        double hash = 0;
        for (int i = 0; i < str.length(); i++) {
            hash += str.charAt(i) * Math.pow(PRIME, i);
        }
        return hash;
    }

    // calulate the hash value by removing first character from previous hash and then adding a new character
    // from text and updating the hash value
    private double updateHash(double prevHash, char oldChar, char newChar, int patternLength) {
        double newHash = (prevHash - oldChar) / PRIME;
        newHash = newHash + newChar * Math.pow(PRIME, patternLength - 1);
        return newHash;
    }

    public void search(String text, String pattern) {
        
        int patternLength = pattern.length();
        double patternHash = calculateHash(pattern);
        double textHash = calculateHash(text.substring(0, patternLength));

        for (int i = 0; i <= text.length() - patternLength; i++) {
            if (textHash == patternHash) {
                //check whether both of the string contains the same characters
                if (text.substring(i, i + patternLength).equals(pattern)) {
                    System.out.println("Pattern found at index " + i);
                    break;
                }
            }

            //if the hash values doesn't matches, update the hash of text and iterate again
            if (i < text.length() - patternLength) 
                textHash = updateHash(textHash, text.charAt(i), text.charAt(i + patternLength), patternLength);  
        }
    }

    public static void main(String[] args) {
        
        KarpRabinPatternSearch algo = new KarpRabinPatternSearch();
        algo.search("ShaZeeshSal", "Zeesh");
    }
}