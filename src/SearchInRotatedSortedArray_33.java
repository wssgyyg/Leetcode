public class SearchInRotatedSortedArray_33 {

    public int search(int[] nums, int target) {

        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        int shift = low;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                shift = i + 1;
                break;
            }
        }

        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            int realMiddle = (middle + shift) % nums.length;
            if (nums[realMiddle] == target) return realMiddle;
            if (nums[realMiddle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;

    }

}
