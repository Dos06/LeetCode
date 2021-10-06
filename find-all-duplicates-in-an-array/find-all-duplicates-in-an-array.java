class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums)
            map.put(i, 1 + map.getOrDefault(i, 0));
        for (int i : map.keySet()) {
            if (map.get(i) > 1)
                list.add(i);
        }
        return list;
    }
}