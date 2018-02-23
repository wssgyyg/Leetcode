public class ContainerWithMostWater_11 {

    public int maxArea(int[] height) {
        int max = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            int temp = Math.min(height[left], height[right]) * (right - left);
            if (temp > max) {
                max = temp;
            }
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return max;
    }

}
