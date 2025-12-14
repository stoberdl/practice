// Last updated: 12/14/2025, 5:55:47 PM
class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1]; 
        }
        return nums;
    }
}