class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] array = s.split("\\s+");
        if (pattern.length() != array.length)
            return false;
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (map.get(pattern.charAt(i)) == null && !map.containsValue(array[i])) {
                map.put(pattern.charAt(i), array[i]);
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (!String.valueOf(map.get(pattern.charAt(i))).equals(array[i])) {
                return false;
            }
        }
        return true;
    }
}