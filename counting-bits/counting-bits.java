class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = convert(i);
        }
        return arr;
    }

    public int convert(int i) {
        String s = Integer.toBinaryString(i);
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') count++;
        }
        return count;
    }
}