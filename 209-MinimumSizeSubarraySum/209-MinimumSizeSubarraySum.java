// Last updated: 12/14/2025, 5:55:53 PM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
            int minLength = 999999;
            int left = 0;
            int count = 0;
            for(int right = 0; right < nums.length; right++){
                    count+= nums[right];
                    while(count >= target){
                        int boundLength = right - left + 1;
                        if(boundLength < minLength){
                            minLength = boundLength;
                        }
                        count -= nums[left];
                        left++;
                    }
            }
            return minLength == 999999 ? 0: minLength;
}}