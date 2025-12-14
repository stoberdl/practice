// Last updated: 12/14/2025, 5:56:08 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                //inc left
                left = mid + 1;
            } else {
                //decr right
                right = mid - 1;
            }
        }
        return left;
    }
}