import java.util.Arrays;

public class SearchForARange_34 {

    public int[] searchRange(int[] nums, int target) {

        int start = firstGreaterEqual(nums, target);
        if (start == nums.length || nums[start] != target) {
            return new int[]{-1, -1};
        }

        int end = firstGreaterEqual(nums, target + 1);
        return new int[]{start, end - 1};

    }

    private int firstGreaterEqual(int[] A, int target) {
        int left = 0, right = A.length;
        while (left < right) {
            int middle = (left + right) / 2;
            if (A[middle] < target) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }

        return left;
    }
}
