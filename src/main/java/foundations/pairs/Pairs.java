package foundations.pairs;

import java.util.HashMap;
import java.util.Map;

public class Pairs {

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> result = new HashMap<>();
        for (String s : strings) {
            String firstChar = String.valueOf(s.charAt(0));
            String lastChar = String.valueOf(s.charAt(s.length()-1));
            result.put(firstChar, lastChar);
        }
        return result;
    }
}
