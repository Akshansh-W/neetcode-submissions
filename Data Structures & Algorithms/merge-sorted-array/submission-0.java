class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp = 0;
        while(temp != n){
            nums1[m] = nums2[temp];
            temp++;
            m++;
        }
        Arrays.sort(nums1);
        
    }
}