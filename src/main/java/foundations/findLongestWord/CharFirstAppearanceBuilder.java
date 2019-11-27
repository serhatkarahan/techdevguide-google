package foundations.findLongestWord;

import java.util.HashMap;
import java.util.Map;

public class CharFirstAppearanceBuilder {

    public Map<Character, Integer> build(String s) {
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            result.put(currentChar, i);
        }
        return result;
    }
}
