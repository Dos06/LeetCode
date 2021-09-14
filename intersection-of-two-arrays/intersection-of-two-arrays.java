class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            if (Arrays.stream(nums2).anyMatch(x -> x == i))
                set.add(i);
        }
        return set.stream().mapToInt(Number::intValue).toArray();
    }
}