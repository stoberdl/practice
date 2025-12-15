// Last updated: 12/15/2025, 1:13:07 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        //hashmap of value to index, for loop through nums search hashmap for target - nums[i], if found
4        //return new array size 2 of indices
5        HashMap<Integer, Integer> numToIndex = new HashMap<>();
6        for(int i = 0; i < nums.length; i ++){
7     
8            if(numToIndex.get(target - nums[i]) != null){
9                return new int[]{numToIndex.get(target - nums[i]), i};
10            }
11             numToIndex.putIfAbsent(nums[i], i);
12        }
13        return new int[]{};
14    }
15}