class Solution {
    public int minStartValue(int[] nums) {
        int minStartValue = 0;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = minStartValue + nums[i];
            minStartValue += nums[i];
        }
        int min = 1 - Arrays.stream(arr).min().getAsInt();
        return Math.max(min, 1);
    }
}