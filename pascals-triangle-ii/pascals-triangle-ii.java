class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> finalList = new ArrayList<>(List.of(List.of(1)));
        for (int i = 0; i < rowIndex; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for (int j = 1; j < finalList.get(i).size(); j++) {
                list.add(finalList.get(i).get(j) + finalList.get(i).get(j - 1));
            }
            list.add(1);
            finalList.add(list);
        }
        return finalList.get(rowIndex);
    }
}