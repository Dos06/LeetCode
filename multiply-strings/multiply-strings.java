class Solution {
    public String multiply(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        for (int i = num1.length() - 1; i >= 0; i--) {
            StringBuilder str = new StringBuilder();
            int addFromPrev = 0;
            for (int j = num2.length() - 1; j >= 0; j--) {
                int result = Integer.parseInt(String.valueOf(num1.charAt(i))) * Integer.parseInt(String.valueOf(num2.charAt(j)));
                result += addFromPrev;
                addFromPrev = result / 10;
                str.insert(0, result % 10);
            }
            str.insert(0, addFromPrev);
            list.add(str.append("0".repeat(num1.length() - 1 - i)).toString().replaceFirst("^0+(?!$)", ""));
        }

        Collections.reverse(list);
        List<String> newList = new ArrayList<>();
        int maxLen = list.get(0).length();
        for (String value : list) {
            int len = value.length();
            newList.add("0".repeat(maxLen - len) + value);
        }


        int addFromPrev = 0;
        for (int i = maxLen - 1; i >= 0; i--) {
            int result = addFromPrev;
            for (String s : newList) {
                result += Integer.parseInt(String.valueOf(s.charAt(i)));
            }
            addFromPrev = result / 10;
            sb.insert(0, result % 10);
        }
        sb.insert(0, addFromPrev);

        return sb.toString().replaceFirst("^0+(?!$)", "");
    }
}