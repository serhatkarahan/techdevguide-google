package foundations.findLongestWord;

import java.util.List;
/*
    Check each dictionary word using a greedy algorithm
 */
public class FindLongestWordImpl1 implements FindLongestWord{

    public String solution(String s, List<String> d) {
        char[] sChars = s.toCharArray();
        String result = "";
        for (String word : d) {
            if (isSubsequence(sChars, word) && isLongerWord(result, word)) {
                result = word;
            }
        }
        return result;
    }

    private boolean isLongerWord(String oldWord, String newWord) {
        return newWord.length() > oldWord.length();
    }

    private boolean isSubsequence(char[] sChars, String word) {
        int i = 0;
        for (char c : sChars) {
            if (c == word.charAt(i)) {
                i++;
            }
            if (i == word.length()) {
                return true;
            }
        }
        return false;
    }
}
