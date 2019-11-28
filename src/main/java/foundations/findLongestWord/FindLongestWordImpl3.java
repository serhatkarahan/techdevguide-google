package foundations.findLongestWord;

import foundations.findLongestWord.helper.CharFirstAppearanceBuilder;
import foundations.findLongestWord.helper.CharPositionDenseBuilder;

import java.util.List;
import java.util.Map;

/*
    An optimal O(N+L) approach for small alphabets
 */
public class FindLongestWordImpl3 implements FindLongestWord {

    public String solution(String s, List<String> d) {
        String result = "";
        Map<Character, Integer> charFirstAppearances = new CharFirstAppearanceBuilder().build(s);
        Map<Character, List<Integer>> sCharPositions = new CharPositionDenseBuilder().build(s);

        for (String word : d) {
            if (isSubsequence(charFirstAppearances, sCharPositions, word) && isLongerWord(result, word)) {
                result = word;
            }
        }
        return result;
    }

    private boolean isLongerWord(String oldWord, String newWord) {
        return newWord.length() > oldWord.length();
    }

    private boolean isSubsequence(Map<Character, Integer> charFirstAppearances,
                                  Map<Character, List<Integer>> sCharPositions,
                                  String word) {
        char[] wordChars = word.toCharArray();
        int currentPositionOnGivenString = charFirstAppearances.get(wordChars[0]);
        if (currentPositionOnGivenString == -1) {
            return false;
        }
        for (int i = 1; i < wordChars.length; i++) {
            List<Integer> letterPositions = sCharPositions.get(wordChars[i]);
            if (letterPositions.get(currentPositionOnGivenString) == -1) {
                return false;
            }
            currentPositionOnGivenString = letterPositions.get(currentPositionOnGivenString);
        }
        return true;
    }
}
