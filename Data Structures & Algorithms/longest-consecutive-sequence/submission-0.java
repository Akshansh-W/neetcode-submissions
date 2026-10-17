class Solution {
    public int longestConsecutive(int[] nums) {
      int maxLen = 0;
      HashSet<Integer> set = new HashSet<>();
      for(int num : nums){
        set.add(num);
      }
      for(int num : nums){
        if(!set.contains(num-1)){
          int currNum = num, seq = 1;
          while(set.contains(currNum + 1)){
            currNum += 1;
            seq += 1;
          }
        maxLen = Math.max(maxLen, seq);
        }
      }
      return maxLen;

    }
}
