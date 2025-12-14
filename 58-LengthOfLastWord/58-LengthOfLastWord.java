// Last updated: 12/14/2025, 5:56:09 PM
class Solution {
    public int lengthOfLastWord(String s) {
        int charCount = 0;
        for(int i =0; i < (s.stripTrailing()).length(); i++){
       
            if((s.charAt(i)) != ' '){
              charCount++;
            }else{
                charCount = 0;
            }

        }
        return charCount;
    }
}