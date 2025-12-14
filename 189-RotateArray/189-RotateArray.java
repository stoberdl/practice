// Last updated: 12/14/2025, 5:55:56 PM
class Solution {
    public void rotate(int[] nums, int k) {
      
        int[] numsCopy = nums.clone();
        for(int i = 0; i < nums.length; i++){
            int position = (i + k) % nums.length;
            nums[position] = numsCopy[i];
        }
    }
}