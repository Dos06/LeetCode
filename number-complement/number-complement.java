class Solution {
    public int findComplement(int num) {
        char[] nums = Integer.toBinaryString(num).toCharArray();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] == '0' ? '1' : '0';
        }
        return Integer.parseInt(String.valueOf(nums), 2);
    }
}