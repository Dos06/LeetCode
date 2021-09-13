class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        long result = 0;
        double ratio;
        Map<Double, Integer> map = new HashMap<>();
        for (int[] r : rectangles) {
            ratio = r[0] / (double) r[1];
            result += map.getOrDefault(ratio, 0);
            map.put(ratio, (map.getOrDefault(ratio, 0) + 1));
        }
        return result;
    }
}