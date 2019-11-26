package foundations;

import java.util.List;

public class FindLongestWord {

    public static String solution(String s, List<String> d) {
        char[] sChars = s.toCharArray();
        String result = "";
        for (String word : d) {
            if (isSubsequence(sChars, word) && isLongerWord(result, word)) {
                result = word;
            }
        }
        return result;
    }

    private static boolean isLongerWord(String oldWord, String newWord) {
        return newWord.length() > oldWord.length();
    }

    private static boolean isSubsequence(char[] sChars, String word) {
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
