class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            while (nums[left] % 2 == 0) {
                left++;
            }
            while (nums[right] % 2 == 1) {
                right--;
            }
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        
        int[] even = Arrays.copyOfRange(nums, 0, nums.length / 2);
        int[] odd = Arrays.copyOfRange(nums, nums.length / 2, nums.length);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < even.length; i++) {
            list.add(even[i]);
            list.add(odd[i]);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}