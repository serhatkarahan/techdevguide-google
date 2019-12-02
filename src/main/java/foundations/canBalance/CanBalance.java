package foundations.canBalance;

public class CanBalance {

    public boolean canBalance(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        int left = -1;
        int right = nums.length;
        int sumLeft = 0;
        int sumRight = 0;
        while (left < right) {
            if (sumLeft == sumRight) {
                if (right - left > 1) {
                    left++;
                    sumLeft += nums[left];
                    right--;
                    sumRight += nums[right];
                } else {
                    return right - left == 1;
                }
            } else {
                if (sumLeft < sumRight) {
                    left++;
                    sumLeft += nums[left];
                } else {
                    right--;
                    sumRight += nums[right];
                }
            }
        }
        return false;
    }
}
