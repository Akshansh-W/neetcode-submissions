class Solution {
    public boolean check(int[] nums) {
        int[] originalNums = Arrays.copyOf(nums,nums.length);
        int[] sortedNums = Arrays.copyOf(nums,nums.length);

        Arrays.sort(sortedNums);

        if(Arrays.equals(sortedNums,originalNums)){
            return true;
        }

        for(int i=0;i<nums.length;i++){
            int temp = originalNums[nums.length-1];
            for(int j=originalNums.length-2;j>=0;j--){
                originalNums[j+1] = originalNums[j];
            }
            originalNums[0] = temp;
            if(Arrays.equals(sortedNums,originalNums)){
            return true;
        }
        }
        return false;
    }
}