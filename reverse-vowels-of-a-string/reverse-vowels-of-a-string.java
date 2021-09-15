class Solution {
    public String reverseVowels(String s) {
        String regex = "[AEIOUaeiou]";
        List<Character> letters = new ArrayList<>();
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.toString(c).matches(regex)) {
                letters.add(c);
                indexes.add(i);
            }
        }
        Collections.reverse(letters);
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i<letters.size(); i++) {
            sb.setCharAt(indexes.get(i), letters.get(i));
        }
        return sb.toString();
    }
}