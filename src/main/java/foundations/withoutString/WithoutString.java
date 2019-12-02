package foundations.withoutString;

public class WithoutString {

    public String solution(String base, String remove) {
        return base.toLowerCase().replace(remove.toLowerCase(), "");
    }
}
