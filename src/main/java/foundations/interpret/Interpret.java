package foundations.interpret;

public class Interpret {

    public int interpret(int value, String[] commands, int[] args) {
        if (commands.length > 0) {
            String command = commands[0];
            if ("+".equals(command)) {
                return value + args[0];
            }
            return value - args[0];
        }
        return -1;
    }
}
