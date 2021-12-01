class Solution {
    public int rob(int[] nums) {
        int max = nums[0];
        if (nums.length == 1)
            return max;

        for (int i = 2; i < nums.length; i++) {
            nums[i] += max;
            max = Math.max(max, nums[i - 1]);
        }
        return Math.max(nums[nums.length - 1], nums[nums.length - 2]);
    }
}