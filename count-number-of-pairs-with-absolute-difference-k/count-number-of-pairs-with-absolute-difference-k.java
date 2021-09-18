class Solution {
    public int countKDifference(int[] nums, int k) {
        int result = 0;
        int n = nums.length;
        if (n < 2) return result;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) 
                    result++;
            }
        }
        return result;
    }
}