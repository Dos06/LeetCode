class Solution {
    public String reverseOnlyLetters(String s) {
        Map<Integer, Character> map = new HashMap<>();
        String regex = "[^A-Za-z]";
        for (int i = 0; i < s.length(); i++) {
            if (Character.toString(s.charAt(i)).matches(regex))
                map.put(i, s.charAt(i));
        }
        System.out.println(map);
        s = s.replaceAll(regex, "");
        System.out.println(s);
        StringBuilder sb = new StringBuilder(s).reverse();
        System.out.println(sb);
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        for (int i : list) {
            sb.insert(i, map.get(i));
        }
        return sb.toString();
    }
}