// Last updated: 12/14/2025, 5:55:45 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
   
        
       
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        double windowAvg = windowSum* 1.0 /(double) k;
        int maxSum = windowSum;
        double maxAvg = maxSum * 1.0 / (double)k;
     
        for (int i = k; i < nums.length; i++) {
            windowSum = windowSum - nums[i - k] + nums[i];
            windowAvg = windowSum / k;
            maxSum = Math.max(maxSum, windowSum);
            maxAvg = Math.max(maxSum * 1.0 / k, windowAvg);
        }
        
        return maxAvg;
    }
}