class Solution {
    public String reversePrefix(String word, char ch) {
        if (word.indexOf(ch) < 0) return word;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                word = new StringBuilder(word.substring(0, i + 1))
                        .reverse()
                        .append(word, i + 1, word.length())
                        .toString();
                break;
            }
        }
        return word;
    }
}