package foundations.findLongestWord;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    Preprocesses given string by building a char position map, therefore finding if a word is a subsequence of string is much faster
 */
public class FindLongestWordImpl2 implements FindLongestWord {

    public String solution(String s, List<String> d) {
        String result = "";
        Map<Character, List<Integer>> sCharPositions = buildCharPositions(s);
        for (String word : d) {
            if (isSubsequence(sCharPositions, word) && isLongerWord(result, word)) {
                result = word;
            }
        }
        return result;
    }

    private Map<Character, List<Integer>> buildCharPositions(String s) {
        Map<Character, List<Integer>> sCharPositions = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            List<Integer> positions = sCharPositions.getOrDefault(c, new ArrayList<>());
            positions.add(i);
            sCharPositions.put(c, positions);
        }
        return sCharPositions;
    }

    private boolean isLongerWord(String oldWord, String newWord) {
        return newWord.length() > oldWord.length();
    }

    private boolean isSubsequence(Map<Character, List<Integer>> sCharPositions, String word) {
        int currentPositionOnGivenString = -1;
        for (char c : word.toCharArray()) {
            List<Integer> letterPositions = sCharPositions.get(c);
            if (letterPositions == null) {
                return false;
            }
            int position = findSmallestNumberBiggerThanGiven(letterPositions, currentPositionOnGivenString);
            if (position == -1) {
                return false;
            }
            currentPositionOnGivenString = position;
        }
        return true;
    }

    private int findSmallestNumberBiggerThanGiven(List<Integer> numbers, int given) {
        if (numbers.size() == 0) {
            return -1;
        }
        if (numbers.size() == 1) {
            if (numbers.get(0) > given) {
                return numbers.get(0);
            } else {
                return -1;
            }
        }
        int mid = numbers.size() / 2;
        if (numbers.get(mid) > given) {
            Integer biggerThanGiven = numbers.get(mid);
            int smallestNumberBiggerThanGivenInSubList = findSmallestNumberBiggerThanGiven(numbers.subList(0, mid), given);
            if (smallestNumberBiggerThanGivenInSubList == -1) {
                return biggerThanGiven;
            } else {
                return smallestNumberBiggerThanGivenInSubList;
            }
        } else {
            return findSmallestNumberBiggerThanGiven(numbers.subList(mid, numbers.size()), given);
        }
    }
}
