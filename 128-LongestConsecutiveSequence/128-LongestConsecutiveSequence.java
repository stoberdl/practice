// Last updated: 12/17/2025, 4:04:31 PM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        if(nums.length <= 0){
4            return 0;
5        }
6        Set<Integer> numsSet = new HashSet<>();
7        for (int num : nums) {
8            numsSet.add(num);
9        }
10        int longestStreak = 1;
11        int streak = 1;
12        for (Integer num : numsSet) {
13            if (!numsSet.contains(num - 1)) {
14                streak = 1;
15                while (numsSet.contains(num + streak)) {
16                    streak++;
17                }
18            }
19             longestStreak = Math.max(streak, longestStreak);
20        }
21        return longestStreak;
22    }
23
24}