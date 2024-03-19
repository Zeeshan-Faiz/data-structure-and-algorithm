import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadder {

    /*
     * A transformation sequence from word beginWord to word endWord using a
     * dictionary wordList is a
     * sequence of words beginWord -> s1 -> s2 -> ... -> sk such that:
     
     * Every adjacent pair of words differs by a single letter.
     * Every si for 1 <= i <= k is in wordList. Note that beginWord does not need to
     * be in wordList.
     * sk == endWord
    
     * Given two words, beginWord and endWord, and a dictionary wordList, return the
     * number of words in
     * the shortest transformation sequence from beginWord to endWord, or 0 if no
     * such sequence exists.
    
     * Example 1:
     * Input: beginWord = "hit", endWord = "cog", wordList =
     * ["hot","dot","dog","lot","log","cog"]
     * Output: 5
     * Explanation: One shortest transformation sequence is "hit" -> "hot" -> "dot" -> "dog" -> cog", which is 5 words long.
    
     * Example 2:
     * Input: beginWord = "hit", endWord = "cog", wordList =
     * ["hot","dot","dog","lot","log"]
     * Output: 0
     * Explanation: The endWord "cog" is not in wordList, therefore there is no valid transformation sequence.
    */

    static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord))
            return 0;
        int cnt = 0;
        Set<String> dict = new HashSet<>(wordList);
        Queue<String> que = new LinkedList<>();

        que.add(beginWord);

        while (!que.isEmpty()) {
            cnt++;
            int size = que.size();
            for (int k = 0; k < size; k++) {
                String word = que.poll();
                if (word.equals(endWord))
                    return cnt;
                for (int i = 0; i < word.length(); i++) {
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        char[] arr = word.toCharArray();
                        arr[i] = ch;
                        String midWord = new String(arr);
                        if (dict.contains(midWord)) {
                            que.add(midWord);
                            dict.remove(midWord);
                        }
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        
        String beginWord = "hit", endWord = "cog";
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("hot","dot","dog","lot","log","cog"));

        System.out.println(ladderLength(beginWord, endWord, wordList));
    }
}