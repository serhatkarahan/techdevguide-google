package foundations.withoutString;

public class WithoutString {

    public String solution(String base, String remove) {
        StringBuilder sb = new StringBuilder();
        int positionOfSubstring = retrievePositionOfSubstring(base, remove);
        while (positionOfSubstring != -1) {
            sb.append(base, 0, positionOfSubstring);
            base = base.substring(positionOfSubstring + remove.length());
            positionOfSubstring = retrievePositionOfSubstring(base, remove);
        }
        sb.append(base);
        return sb.toString();
    }

    private int retrievePositionOfSubstring(String base, String remove) {
        return base.toLowerCase().indexOf(remove.toLowerCase());
    }
}
