package foundations;

import java.util.List;

public class FindLongestWord {

    public static String solution(String s, List<String> d) {
        String result = "";
        for (String word : d) {
            if (isSubsequence(s, word) && isLongerWord(result, word)) {
                result = word;
            }
        }
        return result;
    }

    private static boolean isLongerWord(String oldWord, String newWord) {
        return newWord.length() > oldWord.length();
    }

    private static boolean isSubsequence(String s, String word) {
        char[] sChars = s.toCharArray();
        char[] wordChars = word.toCharArray();
        int i = 0;
        for (char c : sChars) {
            if (c == wordChars[i]) {
                i++;
            }
            if (i == word.length()) {
                return true;
            }
        }
        return false;
    }
}
