// Last updated: 12/15/2025, 12:54:10 PM
1class Solution {
2    public boolean wordPattern(String pattern, String s) {
3        HashMap<String, Character> wordToChar = new HashMap<>();
4        HashMap<Character, String> charToWord = new HashMap<>();
5        String[] words = s.split(" ");
6        //for loop through words, wordToChar put, charToWord put, if absent
7        //if wordToChar get char != char at i or char to word get word != words[i] false
8        if (words.length != pattern.length()) {
9            return false;
10        }
11        for (int i = 0; i < words.length; i++) {
12
13            Character pChar = pattern.charAt(i);
14            wordToChar.putIfAbsent(words[i], pChar);
15            charToWord.putIfAbsent(pChar, words[i]);
16            if (wordToChar.getOrDefault(words[i], ' ') != pChar
17                    || !(charToWord.getOrDefault(pChar, " ").equals(words[i]))) {
18                return false;
19            }
20        }
21        return true;
22    }
23}