// Last updated: 12/19/2025, 2:26:28 PM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        //two pointers convergin opposite ends, if sum to target return, if over? right --? , if under left ++?
4        int left = 0;
5        int right = numbers.length - 1;
6
7        while (left < right) {
8            if (numbers[left] + numbers[right] == target) {
9                return new int[] { left + 1, right + 1 };
10            } else if (numbers[left] + numbers[right] > target) {
11                right--;
12            } else {
13                left++;
14            }
15        }
16
17        return new int[] { 0, 0 };
18    }
19}