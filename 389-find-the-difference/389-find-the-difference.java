class Solution {
    public char findTheDifference(String s, String t) {
        if (s.length() > 0) {
            for (char c : s.toCharArray()) {
                t = t.replaceFirst(String.valueOf(c), "");
            }
        }
        return t.charAt(0);
    }
}