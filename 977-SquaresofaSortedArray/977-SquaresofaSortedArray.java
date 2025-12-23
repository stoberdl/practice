// Last updated: 12/23/2025, 1:53:15 PM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3
4        for (int i = 0; i < nums.length; i++) {
5            nums[i] = nums[i] * nums[i];
6        }
7        Arrays.sort(nums);
8        return nums;
9        // int[] freq = new int[nums[nums.length - 1] + 1]; //try counting sort if nums are small enough, make array size of largest num
10        // for (int num : nums) {
11        //     freq[num]++;
12        // }
13        // int[] sorted = new int[nums.length];//idk this is taking a lot of space
14        // int index = 0;
15        // for (int num = 0; num < freq.length; num++) {
16        //     for (int j = 0; j < freq[num]; j++) {//yeah this is horrible
17        //         // output i, freq[i] times
18        //         sorted[index] = num;
19        //         index++;
20        //     }
21
22        // }
23        // return sorted;
24    }
25}//todo: work largest to smallest on left and right ends builind array from both ends