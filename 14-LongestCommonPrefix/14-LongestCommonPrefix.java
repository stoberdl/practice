// Last updated: 12/14/2025, 5:56:15 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String commonPrefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int smallestStrLength =Math.min(commonPrefix.length(), strs[i].length()); 
            if(smallestStrLength <= 0){
                return "";
            }
            for (int j = 0; j < smallestStrLength; j++) {
                if(commonPrefix.charAt(j) !=  strs[i].charAt(j)){
                   commonPrefix = commonPrefix.substring(0, j);
                    break;
                }
            commonPrefix = commonPrefix.substring(0, smallestStrLength);
            }

        }
        return commonPrefix;
    }
}