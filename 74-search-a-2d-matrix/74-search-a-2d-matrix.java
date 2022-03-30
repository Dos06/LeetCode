class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int[] array = Stream.of(matrix)
                .flatMapToInt(IntStream::of)
                .toArray();
        int x = Arrays.binarySearch(array, target);
        return x >= 0;
    }
}