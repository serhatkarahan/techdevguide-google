package foundations.sumNumbers;

public class SumNumbers {

    public int sumNumbers(String str) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(c);
            } else {
                if (sb.length() > 0) {
                    sum += Integer.parseInt(sb.toString());
                }
                sb.setLength(0);
            }
        }
        if (sb.length() > 0) {
            sum += Integer.parseInt(sb.toString());
        }
        return sum;
    }
}
