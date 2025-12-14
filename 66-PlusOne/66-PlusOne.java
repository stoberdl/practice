// Last updated: 12/14/2025, 5:56:07 PM
class Solution {
    public int[] plusOne(int[] digits) {
 
      //had help
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] != 9) {
                    digits[i] = digits[i] + 1;
                    return digits;
                }
                digits[i] = 0;
            }
            
            
        int[] digitsLonger =  new int[digits.length + 1];
        digitsLonger[0] = 1;
    return digitsLonger;
}
}