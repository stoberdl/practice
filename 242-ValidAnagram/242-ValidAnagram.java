// Last updated: 1/16/2026, 3:19:41 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        //more optimized solution using "voting" add for one subtract for another, if letter equals 0 for each letter
4        //then they are equal, handle unicode
5        if (s.length() != t.length()) {
6            return false;
7        }
8        HashMap<Character, Integer> stCharToVoteMap = new HashMap<>();//s ++, t --
9        for (int i = 0; i < s.length(); i++) {
10            stCharToVoteMap.put(s.charAt(i), stCharToVoteMap.getOrDefault(s.charAt(i), 0) + 1);
11            stCharToVoteMap.put(t.charAt(i), stCharToVoteMap.getOrDefault(t.charAt(i), 0) - 1);
12        }
13        for(Integer vote: stCharToVoteMap.values()){
14            if(vote != 0){
15                return false;
16            }
17        }
18        return true;
19    }
20}