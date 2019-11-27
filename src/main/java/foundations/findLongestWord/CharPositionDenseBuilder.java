package foundations.findLongestWord;

import java.util.*;

public class CharPositionDenseBuilder {

    public Map<Character, List<Integer>> buildDense(String s) {
        Map<Character, List<Integer>> result = initializeResult();
        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            List<Integer> positionList = result.get(currentChar);
            positionList.add(i);
            result.put(currentChar, positionList);
        }
        result.values().forEach(positionList -> positionList.add(-1));
        return result;
    }

    private Map<Character, List<Integer>> initializeResult() {
        Map<Character, List<Integer>> result = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            result.put((char)('a' + i), new ArrayList<>());
        }
        return result;
    }
}
