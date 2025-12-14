// Last updated: 12/14/2025, 5:56:14 PM
class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> brackets = Map.of(
                '(', ')',
                '{', '}',
                '[', ']');

        for (Character c : s.toCharArray()) {
            if (brackets.containsKey(c)) {
                stack.push(c);

            } else if (!stack.isEmpty() && brackets.getOrDefault(stack.peek(), ' ') == c) {
                stack.pop();

            } else {
                return false;
            }

        }
        return stack.isEmpty();
    }
}