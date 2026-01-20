// Last updated: 1/20/2026, 11:18:49 AM
1/**
2 * @param {number[]} nums
3 * @param {number} target
4 * @return {number[]}
5 */
6var twoSum = function(nums, target) {
7    const numToIndex = new Map();
8    for(let i =0; i < nums.length; i++){
9        if(numToIndex.has(target - nums[i])){
10            return [numToIndex.get(target - nums[i]), i];
11        }
12        numToIndex.set(nums[i], i);
13    }
14};