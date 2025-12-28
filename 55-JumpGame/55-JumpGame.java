// Last updated: 12/28/2025, 1:51:10 PM
1class Solution {
2    public boolean canJump(int[] nums) {
3        //READ first index value and up to its jump distance values, maybe a loop(might be bad complexity) see if reaches end on each
4        //what if went through loop one time, calculate nums to see if = length, needs a reachable check, recursive method?
5        int goalIndex = nums.length -1;
6        for (int i = nums.length-1; i >= 0; i--) {
7            if(nums[i] + i >= goalIndex ){
8                goalIndex = i;
9            }
10        }
11        return goalIndex == 0;
12    }
13}