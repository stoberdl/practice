// Last updated: 12/18/2025, 1:00:12 PM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        if (nums.length <= 0) {
4            return 0;
5        }
6        //hash set/map of values for quick lookup, for loop through nums, check if start of sequence,
7        //then loop throug that sequence for highest streak, skip for loops of non sequence starters, does not contain n -1
8        int currStreak = 1;
9        int highStreak = 1;
10        Set<Integer> numSet = new HashSet<>();
11        for (int num : nums) {
12            numSet.add(num);
13        }
14        for (Integer num : numSet) {
15            if (!numSet.contains(num - 1)) {
16                while (numSet.contains(num + currStreak)) {
17                    currStreak++;
18                }
19                highStreak = Math.max(highStreak, currStreak);
20            }
21            currStreak = 1;
22        }
23        return highStreak;
24    }
25}