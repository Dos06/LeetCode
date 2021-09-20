class Solution {
    public int numDistinct(String s, String t) {
        int m = s.length();
        int n = t.length();
        if (m < n) return 0;
        if (m == n) return s.equals(t) ? 1 : 0;
        int[][] arr = new int[n + 1][m + 1];
        for (int i = 0; i <= m; i++) {
            arr[0][i] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (t.charAt(i - 1) == s.charAt(j - 1))
                    arr[i][j] = arr[i - 1][j - 1] + arr[i][j - 1];
                else
                    arr[i][j] = arr[i][j - 1];
            }
        }
        return arr[n][m];
    }
}