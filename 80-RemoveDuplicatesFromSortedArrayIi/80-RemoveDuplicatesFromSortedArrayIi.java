// Last updated: 12/14/2025, 5:56:07 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int kept = 0;
        int lastNum = -99999;
        int countOfLast = 99999;
        for(int i = 0; i < nums.length; i++){
            if(lastNum != nums[i]){
                nums[kept] = nums[i];
                countOfLast = 1;
                kept++;
            }else if(lastNum == nums[i] && countOfLast < 2){
                nums[kept] = nums[i];
                countOfLast++;
                kept++;
            }
            lastNum = nums[i];

        }
        return kept;
    }
}