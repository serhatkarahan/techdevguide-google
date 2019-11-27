package foundations.findLongestWord;

import java.util.*;

public class CharPositionDenseBuilder {

    public Map<Character, List<Integer>> buildDense(String s) {
        Map<Character, List<Integer>> result = new HashMap<>();
        result.put('a', new ArrayList<>());
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            List<Integer> positionList = result.get(currentChar);
            positionList.add(i);
            result.put(currentChar, positionList);
        }
        return result;
    }
}
