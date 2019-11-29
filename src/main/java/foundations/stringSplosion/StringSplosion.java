package foundations.stringSplosion;

public class StringSplosion {

    public String solution(String s) {
        String result = "";
        for (int i = 1; i <= s.length(); i++) {
            result = result + s.substring(0, i);
        }
        return result;
    }
}
