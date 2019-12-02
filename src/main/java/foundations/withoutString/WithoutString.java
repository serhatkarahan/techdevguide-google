package foundations.withoutString;

public class WithoutString {

    public String solution(String base, String remove) {
        int positionOfSubstring = base.toLowerCase().indexOf(remove.toLowerCase());
        if (positionOfSubstring == -1) {
            return base;
        }
        return base.substring(0, positionOfSubstring);
    }
}
