class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0;
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (stack.size() > 0) {
                if (c == '(')
                    stack.add(c);
                else if (c == ')' && stack.peek() == '(')
                    stack.pop();
                else count++;
            } else if (c == '(' || c == ')')
                stack.add(c);
        }

        while (stack.size() != 0) {
            stack.pop();
            count++;
        }
        return count;
    }
}