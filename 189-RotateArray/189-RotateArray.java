// Last updated: 12/27/2025, 12:00:20 PM
1class Solution {
2    public void rotate(int[] nums, int k) {
3      
4        int[] numsPreRotate = nums.clone();
5        //take original array for reference, using modulus in someway to rotate steps in one pass in place
6        for(int i = 0; i <nums.length; i++){
7           // length 7, index 0, k=3: 0 + 3 % 7 = 3
8            // index 5: (5 + 3) % 7 = 1
9            // so (i+k) % array length = index of one pass rotation
10            nums[   ( (i+k) % nums.length )]= numsPreRotate[i];
11        }
12    }
13}