class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> finalList = new ArrayList<>(List.of(List.of(1)));
        for (int i = 0; i < numRows - 1; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for (int j = 1; j < finalList.get(i).size(); j++) {
                list.add(finalList.get(i).get(j) + finalList.get(i).get(j - 1));
            }
            list.add(1);
            finalList.add(list);
        }
        return finalList;
    }
}