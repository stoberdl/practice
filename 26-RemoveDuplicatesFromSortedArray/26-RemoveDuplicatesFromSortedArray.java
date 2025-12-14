// Last updated: 12/14/2025, 5:56:12 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int kept = 0;
        int lastNum = 999999;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != lastNum){
                nums[kept] = nums[i];
                kept++;
            }
            lastNum = nums[i];
        }
        return kept;
    }
}