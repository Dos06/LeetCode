class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        if (n == 1)
            return nums[0] >= target ? 0 : 1;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] >= target) return i;
            if (nums[i] < target && nums[i + 1] >= target) return i + 1;
        }
        return n;
    }
}