class Solution {
    public int findMin(int[] nums) {
        int prev = nums[0];
        for (int i : nums) {
            if (prev > i) return i;
            prev = i;
        }
        return nums[0];
    }
}