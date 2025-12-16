// Last updated: 12/16/2025, 5:43:05 PM
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        //hashmap way: num to count hashmap, if count ever reaches two in hashmap check if math.abs fits condition, otherwise finish loop and false
4        HashMap<Integer, Integer> numToIndex = new HashMap<>();
5        for(int i = 0; i < nums.length; i++){
6            Integer firstIndex = numToIndex.get(nums[i]);//wont be first in big array, prob error
7            numToIndex.put(nums[i], i);
8            if(firstIndex != null && Math.abs(firstIndex - i) <= k){
9                return true;
10            }
11        }
12        return false;
13    }
14}