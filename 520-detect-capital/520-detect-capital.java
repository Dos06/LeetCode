class Solution {
    public boolean detectCapitalUse(String word) {
        return word.toLowerCase().equals(word)
                || word.toUpperCase().equals(word)
                || capitalize(word).equals(word);
    }

    public static String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}