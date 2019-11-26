package foundations;

import java.util.List;

public class FindLongestWord {

    public static String solution(String s, List<String> d) {
        return d.stream()
                .filter(word -> word.equals(s))
                .findAny()
                .orElse("");
    }
}
