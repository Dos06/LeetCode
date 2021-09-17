class Solution {
    public int numTilePossibilities(String tiles) {
        Set<String> set = new HashSet<>();
        run(tiles, "", set);
        return set.size();
    }

    public void run(String tiles, String str, Set<String> set) {
        if (tiles.length() == 0) return;
        for (int i = 0; i < tiles.length(); i++) {
            String substr = tiles.substring(0, i) + tiles.substring(i + 1);
            String s = str + tiles.charAt(i);
            set.add(s);
            run(substr, str + s, set);
        }
    }
}