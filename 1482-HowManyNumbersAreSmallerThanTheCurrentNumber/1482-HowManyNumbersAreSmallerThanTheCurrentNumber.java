// Last updated: 12/14/2025, 5:55:46 PM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp = nums.clone();
        Arrays.sort(temp);
        HashMap<Integer, Integer> numToIndex = new HashMap<>();
        for(int i = 0; i<temp.length; i++){
            numToIndex.putIfAbsent(temp[i],i);
        }
        
        for(int i = 0; i < nums.length; i++){
            nums[i] = numToIndex.get(nums[i]);//gets the index which is sorted so the index equals the num of nums thats are smaller
        }
        return nums;
    }
}