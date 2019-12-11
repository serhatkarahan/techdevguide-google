package foundations.sortArray;

import java.util.Arrays;

public class SortImpl1 implements Sort {

    @Override
    public int[] sort(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        Arrays.sort(nums);
        int[] numsCopy = new int[nums.length];
        numsCopy[0] = nums[0];
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                numsCopy[j] = nums[i];
                j++;
            }
        }
        return Arrays.copyOfRange(numsCopy, 0, j);
    }
}
