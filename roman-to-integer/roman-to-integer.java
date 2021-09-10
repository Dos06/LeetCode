class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> values = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
        
        int sum = 0;
        int latestDigit = values.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 1; i >= 0; i--) {
            int num = values.get(s.charAt(i));
            if (latestDigit <= num)
                sum += num;
            else
                sum -= num;
            latestDigit = num;
        }
        return sum;
    }
}