package foundations.findLongestWord;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharPositionBuilder {

    public Map<Character, List<Integer>> buildDense(String s) {
        Map<Character, List<Integer>> result = new HashMap<>();
        result.put('a', List.of(-1));
        return result;
    }
}
