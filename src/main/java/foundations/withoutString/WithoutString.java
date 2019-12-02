package foundations.withoutString;

public class WithoutString {

    public String solution(String base, String remove) {
        StringBuilder sb = new StringBuilder();
        int positionOfSubstring = base.toLowerCase().indexOf(remove.toLowerCase());
        while (positionOfSubstring != -1) {
            sb.append(base, 0, positionOfSubstring);
            base = base.substring(positionOfSubstring);
            base = base.substring(remove.length());
            positionOfSubstring = base.toLowerCase().indexOf(remove.toLowerCase());
        }
        sb.append(base);
        return sb.toString();
    }
}
