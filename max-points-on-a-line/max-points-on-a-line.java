class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n <= 2) return n;
        int max = 0;
        for (int i = 0; i < n; i++) {
            Map<Double, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                double slope = 0;
                if (points[i][0] == points[j][0])
                    slope = Double.MAX_VALUE;
                else
                    slope = (points[i][1] - points[j][1]) / (double) (points[i][0] - points[j][0]);
                map.put(slope, map.getOrDefault(slope, 0) + 1);
            }

            for (int v : map.values())
                if (max < v + 1) max = v + 1;
        }
        return max;
    }
}