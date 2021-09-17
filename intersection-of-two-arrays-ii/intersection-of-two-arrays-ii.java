class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();
        for (Integer i : list1) {
            if (list2.contains(i)) {
                result.add(i);
                list2.remove(i);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}