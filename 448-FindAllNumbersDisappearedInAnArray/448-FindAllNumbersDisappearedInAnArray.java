// Last updated: 12/14/2025, 5:55:50 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // sort array  = new array
        // for loop, check if counter = num, if not add counter to disapeare
        // sol 2
        // for loop, to sum the array
        // and sum the counter
        // sum - arrray sum 
        Set<Integer> cleanedNums =  new HashSet<>();
        for (int j = 0; j < nums.length; j++) {
            cleanedNums.add(nums[j]);
        }
        List<Integer> disNums = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = i+1;
   
            if ( !cleanedNums.contains(index)) {
                disNums.add(index);
            }

        }
        return disNums;
    }
}