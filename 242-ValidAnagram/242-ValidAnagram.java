// Last updated: 1/16/2026, 3:08:10 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        //hashmap for holding letters to num of letters, if equal at end then true;
4        if (s.length() != t.length()) {
5            return false;
6        }
7        HashMap<Character, Integer> sCharToCountMap = new HashMap<>();
8        HashMap<Character, Integer> tCharToCountMap = new HashMap<>();
9        for (int i = 0; i < s.length(); i++) {
10            sCharToCountMap.put(s.charAt(i), sCharToCountMap.getOrDefault(s.charAt(i), 0) + 1);
11            tCharToCountMap.put(t.charAt(i), tCharToCountMap.getOrDefault(t.charAt(i), 0) + 1);
12        }
13        return sCharToCountMap.equals(tCharToCountMap);
14    }
15}