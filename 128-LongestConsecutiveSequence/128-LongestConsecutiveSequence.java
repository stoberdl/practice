// Last updated: 1/6/2026, 11:51:53 AM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        if(nums.length == 0) return 0;
4        //for loop through nums put into hashset(save space) , 
5        //new for loop, if start of seq(get from map and returns nothing from -1), while loop until end of sequence count, math max it
6        Set<Integer> numSet = new HashSet<>();
7        int longestSequence = 0;
8        for(int num: nums){
9            numSet.add(num);
10        }
11        for(Integer num: numSet){
12            int count = 0;
13            if(numSet.contains(num-1)){
14                continue;
15            }
16            while(numSet.contains(num + count)){
17                count++;
18                longestSequence = Math.max(longestSequence, count);
19            }
20        }
21        return longestSequence;
22    }
23}