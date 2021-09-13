class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0, maxResult = 0;
        for (int i : nums) {
            if (i == 1) result++;
            else result = 0;
            if (result > maxResult) maxResult = result;
        }
        return maxResult;
    }
}