class Solution {
    public int trap(int[] height) {
        int result = 0;
        for (int i = 0; i < height.length; i++) {
            int left = height[i];
            int right = height[i];
            for (int j = i; j >= 0; j--) {
                left = Math.max(left, height[j]);
            }
            for (int j = i; j < height.length; j++) {
                right = Math.max(right, height[j]);
            }
            result += Math.min(left, right) - height[i];
        }
        return result;
    }
}