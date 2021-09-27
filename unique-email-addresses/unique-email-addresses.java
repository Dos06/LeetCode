class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String s : emails) {
            String[] strings = s.split("@");
            strings[0] = strings[0].replace(".", "");
            if (strings[0].indexOf('+') >= 0)
                strings[0] = strings[0].substring(0, strings[0].indexOf('+'));
            set.add(strings[0] + "@" + strings[1]);
        }
        return set.size();
    }
}