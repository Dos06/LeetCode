class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> list = new ArrayList<>();
        if (num == null || num.length() == 0) return list;
        recurse(list, "", num, target, 0, 0, 0);
        return list;
    }

    public void recurse(List<String> list, String path, String num, int target, int pos, long eval, long multed) {
        if (pos == num.length()) {
            if (target == eval)
                list.add(path);
            return;
        }
        for (int i = pos; i < num.length(); i++) {
            if (i != pos && num.charAt(pos) == '0') break;
            long cur = Long.parseLong(num.substring(pos, i + 1));
            if (pos == 0) {
                recurse(list, path + cur, num, target, i + 1, cur, cur);
            } else {
                recurse(list, path + "+" + cur, num, target, i + 1, eval + cur, cur);
                recurse(list, path + "-" + cur, num, target, i + 1, eval - cur, -cur);
                recurse(list, path + "*" + cur, num, target, i + 1, eval - multed + multed * cur, multed * cur);
            }
        }
    }
}