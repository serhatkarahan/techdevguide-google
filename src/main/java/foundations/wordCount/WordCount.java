package foundations.wordCount;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> result = new HashMap<>();
        for (String s : strings) {
            Integer currentCount = result.getOrDefault(s, 0);
            result.put(s, currentCount + 1);
        }
        return result;
    }
}
