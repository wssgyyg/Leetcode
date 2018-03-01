public class SearchInsertPosition_35 {

    public int searchInsert(int[] nums, int target) {

        /*int left = 0, right = nums.length;

        while (left < right) {
            int middle = (left + right) / 2;
            if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }

        return left;*/
        int i = 0;
        for (; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        int j = 0;
        for (; j < nums.length; j++) {
            if (nums[j] > target) {
                return j;
            }
        }

        return j;
    }

}
