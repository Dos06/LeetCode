class Solution {
    public boolean isPowerOfFour(int n) {
        if (n == 1) return true;
        if (n < 1 || n % 2 == 1) return false;
        long res = recurse(n, 4);
        return res == -1;
    }

    public long recurse(int n, long four) {
        if (n == four) return -1;
        if (n < four) return 0;
        return recurse(n, four * 4);
    }
}