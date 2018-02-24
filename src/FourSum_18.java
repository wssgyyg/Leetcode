import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FourSum_18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);

        List<List<Integer>> resultList = new LinkedList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                for (int j = i + 1; j < nums.length - 2; j++) {
                    if (j == i + 1 || nums[j] != nums[j - 1]) {
                        int remain = target - nums[i] - nums[j];
                        int left = j + 1;
                        int right = nums.length - 1;
                        while (left < right) {
                            int twoSum = nums[left] + nums[right];
                            if (twoSum == remain) {
                                resultList.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                                while (left < right && nums[++left] == nums[left - 1]);
                                while (left < right && nums[--right] == nums[right + 1]);
                            } else if (twoSum < remain) {
                                left++;
                            } else {
                                right--;
                            }
                        }
                    }
                }
            }

        }
        return resultList;
    }

}
