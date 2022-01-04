class Solution {
    public int bitwiseComplement(int n) {
        StringBuilder nStr = new StringBuilder(Integer.toBinaryString(n));
        for (int i = 0; i < nStr.length(); i++) {
            nStr.setCharAt(i, Character.forDigit(1 - Character.getNumericValue(nStr.charAt(i)), 10));
        }
        return Integer.parseInt(nStr.toString(), 2);
    }
}