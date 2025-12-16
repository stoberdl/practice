// Last updated: 12/16/2025, 1:10:49 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        //loop through string, add to hashmaps and increment existing valujes, new loop to check counts, compare hash maps actually?
4        if (s.length() != t.length()) {
5            return false;
6        }
7        HashMap<Character, Integer> tCharToCount = new HashMap<>();
8        HashMap<Character, Integer> sCharToCount = new HashMap<>();
9        for (int i = 0; i < s.length(); i++) {
10            sCharToCount.put(s.charAt(i), sCharToCount.getOrDefault(s.charAt(i), 0) + 1);
11            tCharToCount.put(t.charAt(i), tCharToCount.getOrDefault(t.charAt(i), 0) + 1);
12        }
13        if (tCharToCount.equals(sCharToCount)) {
14            return true;
15        }
16        return false;
17    }
18}