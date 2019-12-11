package foundations.sortArray;

import java.util.Arrays;

public class SortImpl2 implements Sort {

    @Override
    public int[] sort(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        Arrays.sort(nums);
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return Arrays.copyOfRange(nums, 0, j);
    }
}
