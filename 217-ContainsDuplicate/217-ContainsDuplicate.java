// Last updated: 12/14/2025, 5:55:53 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> dupeFreeSet = Arrays.stream(nums).boxed().collect(Collectors.toCollection(HashSet::new));
        return (dupeFreeSet.size() != nums.length);
    }
}