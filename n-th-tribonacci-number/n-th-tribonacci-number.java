class Solution {
    public int tribonacci(int n) {
        List<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 1));
        for (int i = 2; i < n; i++)
            list.add(list.get(i) + list.get(i - 1) + list.get(i - 2));
        return list.get(n);   
    }
}