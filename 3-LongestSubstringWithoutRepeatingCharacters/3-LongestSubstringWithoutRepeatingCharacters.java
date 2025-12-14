// Last updated: 12/14/2025, 5:56:18 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        //hashmap of seen characters, use map.size() to determine max substring length
        //stop right side on dupe, from seeing on key rfetival?? 
        //iterate left and right? on left iterate remove key and left++
       Set<Character> chars = new HashSet<>();
        int maxSize = 0;
        int left = 0;
        for(int right = 0; right < s.length(); right++){
            while(chars.contains(s.charAt(right))){
                chars.remove(s.charAt(left));
                left++; 
            }
            chars.add(s.charAt(right));
            maxSize = Math.max(maxSize, chars.size());
        }
        return maxSize;
    }
}