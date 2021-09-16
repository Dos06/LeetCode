class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int n = s.length();
        if (n < 2) return n;
        for (int i = 0; i < n; i++) {
            List<Character> list = new ArrayList<>(List.of(s.charAt(i)));
            for (int j = i + 1; j < n; j++) {
                if (list.contains(s.charAt(j)))
                    break;
                list.add(s.charAt(j));
            }
            max = Math.max(max, list.size());
        }
        return max;
    }
}