public class MaximumSubarray_53 {

    public int maxSubArray(int[] nums) {
        int nowSum = nums[0];
        int maxSum = nowSum;
        for (int i = 1; i < nums.length; i++) {
            if (nowSum > 0) {
                nowSum += nums[i];
            } else {
                nowSum = nums[i];
            }

            maxSum = Math.max(maxSum, nowSum);
        }
        return maxSum;
    }

}
