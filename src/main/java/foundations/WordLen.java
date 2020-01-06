package foundations;

import java.util.HashMap;
import java.util.Map;

public class WordLen {

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> result = new HashMap<>();
        for (String s : strings) {
            result.put(s, s.length());
        }
        return result;
    }
}
