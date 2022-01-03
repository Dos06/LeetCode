class Solution {
    public int findJudge(int n, int[][] trust) {
        Map<Integer, Integer> trusting = new HashMap<>(n);
        Map<Integer, Integer> trusted = new HashMap<>(n);
        for (int[] arr : trust) {
            trusting.put(arr[0], 1 + trusting.getOrDefault(arr[0], 0));
            trusted.put(arr[1], 1 + trusted.getOrDefault(arr[1], 0));
        }
        for (int i = 1; i <= n; i++) {
            if (trusting.getOrDefault(i, 0) == 0 && trusted.getOrDefault(i, 0) == n - 1)
                return i;
        }
        return -1;
    }
}