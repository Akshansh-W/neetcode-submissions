class Solution {
    public int maxAscendingSum(int[] nums) {
      int totalSum=0,maxSum=0;
      for(int i=0;i<nums.length;i++){
        if(i == 0){
          totalSum += nums[i];
        }else{
          if(nums[i] > nums[i-1]){
            totalSum += nums[i];
          }else{
            totalSum = nums[i];
          }
        }
        maxSum = Math.max(maxSum, totalSum);
      }
       return maxSum;
    }
}