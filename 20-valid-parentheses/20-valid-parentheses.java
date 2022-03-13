class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Map<Character, Character> map = new HashMap<>(Map.of(
                '}', '{',
                ']', '[',
                ')', '('
        ));
        
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (map.containsValue(c)) 
                stack.add(c);
            else if (!stack.isEmpty() && map.get(c).equals(stack.peek())) 
                stack.pop();
            else return false;
        }
        return stack.isEmpty();
    }
}