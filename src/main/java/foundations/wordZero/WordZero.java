package foundations.wordZero;

import java.util.HashMap;
import java.util.Map;

public class WordZero {

    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> result = new HashMap<>();
        for (String s : strings) {
            result.put(s, 0);
        }
        return result;
    }
}
