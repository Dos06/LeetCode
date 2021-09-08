class Solution {
    public int reverse(int x) {
        String s = String.valueOf(x);
        boolean flag = false;
        if (s.startsWith("-")) {
            flag = true;
            s = s.substring(1);
        }
        s = new StringBuilder(s).reverse().toString();
        if (s.length() > 1 && s.charAt(0) != '0') {
            s = s.replaceFirst("^0*", "");
            System.out.println(s);
        }
        long l = Long.parseLong(s);
        if (l > 2147483647 || l < -2147483648) return 0;
        int i = (int) l;
        if (flag) i *= -1;
        return i;
    }
}