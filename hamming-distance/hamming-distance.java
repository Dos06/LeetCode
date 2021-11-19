class Solution {
    public int hammingDistance(int x, int y) {
        StringBuilder bin1 = new StringBuilder(Integer.toBinaryString(x));
        StringBuilder bin2 = new StringBuilder(Integer.toBinaryString(y));
        bin1.insert(0, "0".repeat(Math.max(0, bin2.toString().length() - bin1.toString().length())));
        bin2.insert(0, "0".repeat(Math.max(0, bin1.toString().length() - bin2.toString().length())));
        int count = 0;
        for (int i = 0; i < bin1.toString().length(); i++) {
            if (bin1.toString().charAt(i) != bin2.toString().charAt(i))
                count++;
        }
        return count;
    }
}