class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] arr = new int[n + 1][m + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1))
                    arr[i][j] = 1 + arr[i - 1][j - 1];
                else
                    arr[i][j] = Math.max(arr[i][j - 1], arr[i - 1][j]);
            }
        }
        return arr[n][m];
    }
}