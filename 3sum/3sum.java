class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3) return result;

        Arrays.sort(nums);

        for (int i : nums) {
            if (i > 0) return result;
            break;
        }

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                int x = -1 * (nums[i] + nums[j]);
                int low = j + 1;
                int high = nums.length - 1;
                while (low <= high) {
                    int mid = low + (high - low) / 2;
                    if (nums[mid] == x) {
                        result.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[mid])));
                        break;
                    } else if (nums[mid] < x)
                        low = mid + 1;
                    else
                        high = mid - 1;
                }

                while (j + 1 < nums.length && nums[j] == nums[j + 1])
                    j++;
            }

            while ((i + 1 < nums.length && nums[i] == nums[i + 1]) || (nums[i] > 0 && i < nums.length - 1)) {
                i++;
            }
        }

        return result;
    }
}