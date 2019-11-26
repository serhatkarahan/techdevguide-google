package foundations.findLongestWord;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindLongestWordImpl2 implements FindLongestWord {

    public String solution(String s, List<String> d) {
        Map<Character, List<Integer>> sCharPositions = buildCharPositions(s);
        return "";

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
}
