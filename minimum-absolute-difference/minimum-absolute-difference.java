class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);
            if (diff <= minDiff) {
                if (diff < minDiff)
                    list = new ArrayList<>();
                list.add(List.of(arr[i], arr[i + 1]));
                minDiff = diff;
            }
        }
        return list;
    }
}