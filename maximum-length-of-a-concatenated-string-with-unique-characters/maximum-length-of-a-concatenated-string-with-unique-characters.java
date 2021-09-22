class Solution {
    public int maxLength(List<String> arr) {
        int[] result = new int[1];
        getMaxLength(0, arr, "", result);
        return result[0];
    }

    public void getMaxLength(int index, List<String> arr, String curStr, int[] maxLength) {
        if (index == arr.size()) {
            if (uniqueCharCount(curStr) > maxLength[0])
                maxLength[0] = curStr.length();
            return;
        }
        getMaxLength(index + 1, arr, curStr + arr.get(index), maxLength);
        getMaxLength(index + 1, arr, curStr, maxLength);
    }

    public int uniqueCharCount(String curStr) {
        int[] count = new int[26];
        for (char c : curStr.toCharArray())
            if (count[c - 'a']++ > 0) return -1;
        return curStr.length();
    }
}