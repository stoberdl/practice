// Last updated: 12/24/2025, 11:50:54 AM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3
4        for (int i = 0; i < nums.length; i++) {
5            nums[i] = nums[i] * nums[i];
6        }
7        int[] sorted = new int[nums.length];
8        int left = 0;
9        int right = sorted.length - 1;
10        int index = sorted.length - 1;
11        while (left <= right) {
12            if (nums[right] > nums[left]) {
13                sorted[index] = nums[right];
14                right--;
15            } else {
16                sorted[index] = nums[left];
17                left++;
18            }
19            index--;
20        }
21        return sorted;
22
23    }
24}