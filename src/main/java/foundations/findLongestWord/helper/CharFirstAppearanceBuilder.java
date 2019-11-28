package foundations.findLongestWord.helper;

import java.util.HashMap;
import java.util.Map;

public class CharFirstAppearanceBuilder {

    public Map<Character, Integer> build(String s) {
        Map<Character, Integer> result = initializeResult();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            result.put(currentChar, i);
        }
        return result;
    }

    private Map<Character, Integer> initializeResult() {
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            result.put((char) ('a' + i), -1);
        }
        return result;
    }
}
