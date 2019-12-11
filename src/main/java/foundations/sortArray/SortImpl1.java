package foundations.sortArray;

import java.util.Arrays;

public class SortImpl1 implements Sort {

    @Override
    public int[] sort(int[] input) {
        if (input.length > 0) {
            return Arrays.copyOfRange(input, 0, 1);
        }
        return input;
    }
}
