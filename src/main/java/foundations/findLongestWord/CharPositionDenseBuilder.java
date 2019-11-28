package foundations.findLongestWord;

import java.util.*;

public class CharPositionDenseBuilder {

    public Map<Character, List<Integer>> buildDense(String s) {
        Map<Character, List<Integer>> result = initializeResult();
        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            for (char c : result.keySet()) {
                List<Integer> positionList = result.get(c);
                if (c == currentChar) {
                    for (int j = 0; j < positionList.size(); j++) {
                        if (positionList.get(j) == -1) {
                            positionList.set(j, i);
                        }
                    }
                    positionList.add(i);
                } else {
                    positionList.add(-1);
                }
            }
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
