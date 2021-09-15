class Solution {
    public String reverseWords(String s) {
        s = s.trim().replaceAll(" +", " ");
        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            sb.append(strings[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}