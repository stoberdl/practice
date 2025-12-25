// Last updated: 12/25/2025, 1:47:17 PM
1class Solution {
2    public int maxArea(int[] height) {
3        //container = highest length vertically * highest possible width horizontally. optimizing between height and width for the highest num
4        int left = 0;
5        int right = height.length -1;
6        int maxWater = 0;
7        while(left < right){
8            int minHeight = Math.min(height[left],height[right]);
9            maxWater = Math.max(maxWater, (right - left) * minHeight);
10            if(height[left] == minHeight){
11                left++;
12            }else if(height[right] == minHeight){
13                right--;
14            }
15        }
16        return maxWater;
17    }
18}