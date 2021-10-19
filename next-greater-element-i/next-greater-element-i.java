class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int finalI = i;
            int index = IntStream.range(0, nums2.length)
                    .filter(e -> nums2[e] == nums1[finalI])
                    .findFirst()
                    .orElse(-1);
            if (index < 0) continue;
            int val = -1;
            for (int j = index; j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    val = nums2[j];
                    break;
                }
            }
            arr[i] = val;
        }
        return arr;
    }
}