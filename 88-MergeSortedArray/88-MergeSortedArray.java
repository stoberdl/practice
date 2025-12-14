// Last updated: 12/14/2025, 5:56:05 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nIndex = 0;
        for(int i = m; i < nums1.length; i++){
            nums1[i] =  nums2[nIndex];
            nIndex++;
        }
        Arrays.sort(nums1);
        // for m elements in nums1
        // dont do anything
        // add nums 2 after m index
        // arrays.sort(nums1)



        //solve this twopointer next time
    }
}