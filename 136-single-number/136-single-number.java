class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Long> map = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList())
                .stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        return Collections.min(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}