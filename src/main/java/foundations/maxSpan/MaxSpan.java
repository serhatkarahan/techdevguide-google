package foundations.maxSpan;

import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;

public class MaxSpan {

    public int solution(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Map<Integer, int[]> seenIndexes = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int[] seenIndex = seenIndexes.getOrDefault(num, new int[]{-1, -1});
            if (seenIndex[0] == -1) {
                seenIndex[0] = i;
            } else {
                seenIndex[1] = i;
            }
            seenIndexes.put(num, seenIndex);
        }
        OptionalInt maxValue = seenIndexes.values().stream()
                .mapToInt(seenIndex -> seenIndex[1] - seenIndex[0] + 1)
                .filter(value -> value > 0)
                .max();
        return maxValue.orElse(1);
    }
}
