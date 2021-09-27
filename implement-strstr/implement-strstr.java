class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.equals(needle)) return 0;
        if (haystack.contains(needle)) {
            for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
                if (needle.equals(haystack.substring(i, i + needle.length())))
                    return i;
            }
        }
        return -1;
    }
}