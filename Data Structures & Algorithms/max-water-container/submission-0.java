class Solution {
    public int maxArea(int[] num) {
      int left = 0;
      int right = num.length-1;
      int maxArea = 0;
      while(left < right){
        int height = Math.min(num[left],num[right]);
        int width = right-left;
        int area = height*width;
        maxArea = Math.max(maxArea,area);
        if(num[left] > num[right]){
          right--;
        }else{
          left++;
        }
      }
      return maxArea;
    }
}
