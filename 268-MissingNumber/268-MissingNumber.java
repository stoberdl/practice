// Last updated: 12/14/2025, 5:55:51 PM
class Solution {
    public int missingNumber(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
         numsMap.put(nums[i], -2);
        }

        for(int j = 0; j <= nums.length; j++){
            if (numsMap.getOrDefault(j, -1) == -1){
                return j;
            }
          
        }
        return -1;//didnt find
    }
}