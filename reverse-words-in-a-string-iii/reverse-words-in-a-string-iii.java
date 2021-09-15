class Solution {
    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String str : strings) {
            sb.append(new StringBuilder(str).reverse().append(" "));
        }
        return sb.toString().trim();
    }
}