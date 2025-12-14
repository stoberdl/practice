// Last updated: 12/14/2025, 5:56:01 PM
class Solution {
    public int majorityElement(int[] nums) {
        int deltaMCount = 0;
        int majorityNum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != majorityNum) {
                deltaMCount--;
            } else {
                deltaMCount++;
            }
            if (deltaMCount < 0) {
                majorityNum = nums[i];
                deltaMCount++;
            }

        }
        return majorityNum;
    }
}