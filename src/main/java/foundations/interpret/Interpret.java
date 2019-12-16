package foundations.interpret;

public class Interpret {

    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String MULTIPLY = "*";
    private static final int DEFAULT_VALUE_FOR_INVALID_INPUT = -1;

    public int interpret(int value, String[] commands, int[] args) {
        if ((commands.length == 0) || (commands.length != args.length)) {
            return DEFAULT_VALUE_FOR_INVALID_INPUT;
        }

        int result = value;
        for (int i = 0; i < commands.length; i++) {
            String command = commands[i];
            if (PLUS.equals(command)) {
                result += args[i];
            } else if (MINUS.equals(command)){
                result -= args[i];
            } else if (MULTIPLY.equals(command)) {
                result *= args[i];
            } else {
                return DEFAULT_VALUE_FOR_INVALID_INPUT;
            }
        }
        return result;
    }
}
