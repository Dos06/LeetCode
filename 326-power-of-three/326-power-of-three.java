class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 1) return true;
        if (n < 1 || n % 2 == 0) return false;
        int res = recurse(n, 3);
        return res == -1;
    }

    public int recurse(int n, long three) {
        if (n == three) return -1;
        if (n < three) return 0;
        return recurse(n, three * 3);
    }
}
