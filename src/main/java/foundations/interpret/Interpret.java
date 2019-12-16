package foundations.interpret;

public class Interpret {

    public static final String PLUS = "+";
    public static final String MINUS = "-";
    public static final String MULTIPLY = "*";

    public int interpret(int value, String[] commands, int[] args) {
        if (commands.length == 0 || commands.length != args.length) {
            return -1;
        }

        int result = value;
        String command = commands[0];
        if (PLUS.equals(command)) {
            result += args[0];
        } else if (MINUS.equals(command)){
            result -= args[0];
        } else if (MULTIPLY.equals(command)) {
            result *= args[0];
        } else {
            return -1;
        }
        return result;
    }
}
