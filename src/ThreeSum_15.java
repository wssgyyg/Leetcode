import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_15 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            if (i == 0 || (nums[i] != nums[i - 1])) {

                int target = 0 - nums[i];
                int left = i + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int temp = nums[left] + nums[right];
                    if (temp == target) {
                        res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < right && nums[++left] == nums[left - 1]) ;
                        while (left < right && nums[--right] == nums[right + 1]) ;
                    } else if (temp < target) {
                        ++left;
                    } else {
                        --right;
                    }
                }
            }
        }

        return res;
    }

}
