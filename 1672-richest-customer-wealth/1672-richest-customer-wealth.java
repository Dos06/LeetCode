class Solution {
    public int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts)
                .mapToInt(arr -> Arrays.stream(arr).reduce(0, Integer::sum))
                .max()
                .getAsInt();
    }
}