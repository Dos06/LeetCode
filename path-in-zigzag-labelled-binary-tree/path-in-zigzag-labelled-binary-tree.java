class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> list = new ArrayList<>(List.of(label));
        int i = label;
        while (i != 1) {
            int depth = (int) (Math.log(i) / Math.log(2));
            int mod = (int) Math.pow(2, depth + 1) - 1 - i;
            i = ((int) Math.pow(2, depth) + mod) / 2;
            list.add(i);
        }
        Collections.reverse(list);
        return list;
    }
}