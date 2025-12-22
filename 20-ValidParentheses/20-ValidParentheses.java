// Last updated: 12/22/2025, 12:11:21 PM
1class Solution {
2    public boolean isValid(String s) {
3        if (s.length() % 2 != 0) {
4            return false;
5        }
6        Deque<Character> charDeck = new ArrayDeque<>();
7        Map<Character, Character> openToClose = Map.of('{', '}', '[', ']', '(', ')');
8        // if get value from map then push it to stack, if its a closing bracket to the stacks opening one pop it, what about nesting?:??
9        for (Character c : s.toCharArray()) {
10            if (openToClose.get(c) != null) {
11                charDeck.push(c);
12            } else if (!charDeck.isEmpty() && c == openToClose.get(charDeck.peek())) {
13                charDeck.pop();
14            }else{
15                return false;
16            }
17        }
18
19        return charDeck.isEmpty();
20
21    }
22}