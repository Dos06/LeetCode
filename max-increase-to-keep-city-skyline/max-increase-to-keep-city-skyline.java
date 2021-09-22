class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int result = 0;
        int n = grid.length;
        int[] maxSouth = new int[n];
        int[] maxWest = new int[n];
        for (int i = 0; i < n; i++) {
            maxWest[i] = Arrays.stream(grid[i]).max().getAsInt();
        }
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] > maxSouth[col])
                    maxSouth[col] = grid[row][col];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result += Math.min(maxWest[j], maxSouth[i]) - grid[i][j];
            }
        }
        return result;
    }
}