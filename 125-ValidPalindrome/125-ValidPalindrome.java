// Last updated: 12/14/2025, 5:56:03 PM
class Solution {
    public boolean isPalindrome(String s) {
        // String sR = new StringBuilder(s.replaceAll("[^a-zA-Z0-9]", "")).reverse().toString();
        // return s.replaceAll("[^a-zA-Z0-9]", "").compareToIgnoreCase(sR) == 0;
        //while loop, left and right converge , pause if bad char
        int left = 0;
        int right = s.length() -1;
        while(left < right){
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if(!Character.isLetterOrDigit(leftChar)){
                left++;
                continue;
            }else if(!Character.isLetterOrDigit(rightChar)){
                right--;
                continue;
            }

            if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar) ){
                    return false;
            }
            left++;
            right--;
        }
        return true;
    }
}