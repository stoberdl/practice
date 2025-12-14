// Last updated: 12/14/2025, 5:56:11 PM
class Solution {
    public int removeElement(int[] nums, int val) {
            int kept = 0;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] != val){
                    nums[kept] = nums[i];
                    kept++;
                }
            }
            return kept;
    }
}