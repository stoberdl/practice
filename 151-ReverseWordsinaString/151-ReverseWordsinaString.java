// Last updated: 12/25/2025, 2:18:44 PM
1class Solution {
2    public String reverseWords(String s) {
3        //gonna for loop through string backward,
4        // build a new string using the .substrings when it reaches a whitespace and if the substring is not empty, 
5        //using for loop index of word start and pointer for word end
6        String reversedS = "";
7        int wordEnd = -1;
8        for(int i = s.length() -1; i >= 0; i-- ){
9          
10            if(wordEnd == -1 && s.charAt(i) != ' ' ){ //maybe deal with digits
11               wordEnd = i;
12            } if(wordEnd != -1 && s.charAt(i) == ' '){
13                reversedS = reversedS + s.substring(i+1, wordEnd+1) + " ";
14                wordEnd = -1;
15            } if(wordEnd != -1 && i == 0){//one letter words
16                 reversedS = reversedS + s.substring(i, wordEnd+1);
17            }
18          
19    }
20    return reversedS.stripTrailing();
21}}