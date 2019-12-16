package foundations.interpret;

public class Interpret {

    public static final String PLUS = "+";

    public int interpret(int value, String[] commands, int[] args) {
        int result = -1;
        if (commands.length > 0) {
            String command = commands[0];
            if (PLUS.equals(command)) {
                result = value + args[0];
            } else {
                result = value - args[0];
            }
        }
        return result;
    }
}
