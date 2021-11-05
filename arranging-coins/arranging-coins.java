class Solution {
    public int arrangeCoins(int n) {
        int count = 0;
        int index = 1;
        while (n > 0) {
            n -= index;
            index++;
            count++;
        }
        return n == 0 ? count : count - 1;
    }
}