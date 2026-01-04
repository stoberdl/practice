// Last updated: 1/4/2026, 1:10:45 PM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        //for loop through entire array and calculate prefix and suffix, store each in their own array, thenm take from them for each i iteration
4        int[] prefixSums = new int[nums.length];
5        int[] suffixSums =  new int[nums.length];
6        prefixSums[0] = 1;
7        suffixSums[nums.length-1] = 1;//no 0 multiplication
8        for(int i = 1; i < nums.length; i++){
9            prefixSums[i] = nums[i-1] * prefixSums[i-1];
10        }
11
12        for(int i = nums.length - 2; i >= 0; i--){
13            suffixSums[i] = nums[i + 1] * suffixSums[i+1]; 
14        }
15        
16       for(int i = 0; i < nums.length; i++){
17            nums[i] = prefixSums[i] * suffixSums[i];
18        }
19
20        return nums;
21    }
22}