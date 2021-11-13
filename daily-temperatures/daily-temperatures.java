class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] arr = new int[temperatures.length];
        if (temperatures.length < 2) return arr;
        for (int i = 0; i < temperatures.length - 1; i++) {
            int count = 0;
            for (int j = i + 1; j < temperatures.length; j++) {
                count++;
                if (temperatures[j] > temperatures[i]) {
                    arr[i] = count;
                    break;
                }
            }
        }
        return arr;
    }
}