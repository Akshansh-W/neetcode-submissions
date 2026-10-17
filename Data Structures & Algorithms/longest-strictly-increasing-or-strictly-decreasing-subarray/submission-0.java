class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc=1,dec=1,len=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] > nums[i-1]){
                inc++;
                dec=1;
            }
            if(nums[i] < nums[i-1]){
                dec++;
                inc=1;
            }
            if(nums[i] == nums[i-1]){
                dec = 1;
                inc = 1;
            }
            len = Math.max(len,Math.max(dec,inc));
        }
        return len;
    }
}