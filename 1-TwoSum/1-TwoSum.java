// Last updated: 1/16/2026, 2:50:31 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        // hashmap of array for lookup of num to index, fast
4        // if num bigger than target skip loop
5        // on each iteration add to hashmap of the seen indices, next lookup hashmap of target - num[i] see if get works from hashmap, if so, good!
6        HashMap<Integer, Integer> numToIndex = new HashMap<>();
7        for(int i = 0; i < nums.length; i++){
8            if(numToIndex.get(target - nums[i]) != null){
9                return new int[]{numToIndex.get(target - nums[i]), i};
10            }
11            numToIndex.put(nums[i], i);
12        }
13        return nums;//somethign went wrong
14}}