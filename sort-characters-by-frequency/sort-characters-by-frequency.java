class Solution {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, 1 + map.getOrDefault(c, 0));
        }

        Map<Character, Integer> newMap =
                map.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .collect(Collectors.toMap(Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new));

        for (char c : newMap.keySet()) {
            sb.append(String.valueOf(c).repeat(Math.max(0, map.get(c))));
        }
        return sb.toString();
    }
}