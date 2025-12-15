// Last updated: 12/15/2025, 11:32:18 AM
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        //hashmap of each ones count, iterate through a string(both equal lenght)
4        HashMap<Character, Character> sCharToTChar = new HashMap<>();
5        HashMap<Character, Character> tCharToSChar = new HashMap<>();
6        for(int i = 0; i < s.length(); i++){
7            Character sChar = s.charAt(i);
8             Character tChar = t.charAt(i);
9            sCharToTChar.putIfAbsent(sChar, tChar);
10             tCharToSChar.putIfAbsent(tChar, sChar);
11        }
12        for(int i = 0; i < s.length(); i++){
13            // s:e to a
14            //t: a to e
15            //get from s2t comapre to t at i OR get from t2s compare to s at I, if either fail return false
16             Character sChar = s.charAt(i);
17             Character tChar = t.charAt(i);
18            if(sCharToTChar.get(sChar) != tChar || tCharToSChar.get(tChar) != sChar){
19                return false;
20            }
21        }
22        return true;
23    }
24}