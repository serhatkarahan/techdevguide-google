package foundations.stringSplosion;

public class StringSplosion {

    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= s.length(); i++) {
            result.append(s, 0, i);
        }
        return result.toString();
    }
}
