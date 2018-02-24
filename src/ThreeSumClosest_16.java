import java.util.Arrays;

public class ThreeSumClosest_16 {

    public int threeSumClosest(int[] nums, int target) {
        if (nums.length < 3) {
            return 0;
        }

        Arrays.sort(nums);

        int minOffset = 0x7fffffff;
        int result = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int remain = target - nums[i];
                int left = i + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int twoSum = nums[left] + nums[right];
                    int offset = Math.abs(twoSum - remain);
                    if (offset < minOffset) {
                        minOffset = offset;
                        result = nums[left] + nums[right] + nums[i];
                    }
                    if (twoSum < remain) {
                        left++;
                    } else if (twoSum > remain) {
                        right--;
                    } else {
                        return target;
                    }

                }
            }
        }

        return result;
    }

}
