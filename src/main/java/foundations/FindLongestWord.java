package foundations;

import java.util.List;

public class FindLongestWord {

    public static String solution(String s, List<String> d) {
        String result = "";
        for (String word : d) {
            if (s.contains(word) && isLongerWord(result, word)) {
                result = word;
            }
        }
        return result;
    }

    private static boolean isLongerWord(String oldWord, String newWord) {
        return newWord.length() > oldWord.length();
    }
}
