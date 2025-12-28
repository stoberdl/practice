// Last updated: 12/28/2025, 2:53:22 PM
1class Solution {
2    public int jump(int[] nums) {
3        if (nums.length <= 1) {
4            return 0;
5        }
6        int jumpCounter = 0;
7        int currentEnd = 0;
8        int farthestJump = 0;
9
10        for (int i = 0; i < nums.length; i++) {
11            farthestJump = Math.max(farthestJump, i + nums[i]);
12            if (i < nums.length -1 && currentEnd == i) {
13                jumpCounter++;
14                currentEnd = farthestJump;
15            }
16        }
17
18        return jumpCounter;
19    }
20}