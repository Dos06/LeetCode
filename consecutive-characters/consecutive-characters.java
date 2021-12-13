class Solution {
    public int maxPower(String s) {
        int max = 0;
        int count = 0;
        char prev = ' ';
        for (char c : s.toCharArray()) {
            if (prev == c) {
                count++;
            } else {
                count = 1;
                prev = c;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}