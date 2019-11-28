package foundations.findLongestWord;

import java.util.*;

public class CharPositionDenseBuilder {

    public Map<Character, List<Integer>> buildDense(String givenStringS) {
        Map<Character, List<Integer>> result = initializeResult();
        for (int indexOfS = 1; indexOfS < givenStringS.length(); indexOfS++) {
            char currentChar = givenStringS.charAt(indexOfS);
            for (char c : result.keySet()) {
                List<Integer> nextPositions = result.get(c); // next positions of char given current index on the given string
                if (c == currentChar) {
                    for (int i = nextPositions.size() - 1; i >= 0; i--) {
                        if (nextPositions.get(i) == -1) {
                            nextPositions.set(i, indexOfS);
                        } else {
                            break;
                        }
                    }
                    nextPositions.add(indexOfS);
                } else {
                    nextPositions.add(-1);
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
