class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, 1);
        int prev = 1;
        for (int i = 0; i < n; i++) {
            result[i] *= prev;
            prev *= nums[i];
        }
        prev = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= prev;
            prev *= nums[i];
        }
        return result;
    }
}