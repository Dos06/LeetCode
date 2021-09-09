class Solution {
    public int maxArea(int[] height) {
        int result  = 0;
        for (int i = 0; i < height.length; ) {
            for (int j = height.length - 1; j >= i; ) {
                int area = (j - i) * Math.min(height[i], height[j]);
                if (height[i] <= height[j]) i++;
                else j--;
                result = Math.max(result, area);
            }
        }
        return result;
    }
}