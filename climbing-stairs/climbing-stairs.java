class Solution {
    public int climbStairs(int n) {
        List<Integer> list = new ArrayList<>(List.of(0, 1, 2));
        for (int i = 3; i <= n; i++) {
            list.add(list.get(i - 1) + list.get(i - 2));
        }
        return list.get(n);
    }
}