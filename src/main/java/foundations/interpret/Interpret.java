package foundations.interpret;

public class Interpret {

    public static final String PLUS = "+";

    public int interpret(int value, String[] commands, int[] args) {
        if (commands.length == 0) {
            return -1;
        }

        int result = value;
        String command = commands[0];
        if (PLUS.equals(command)) {
            result += args[0];
        } else {
            result -= args[0];
        }
        return result;
    }
}
