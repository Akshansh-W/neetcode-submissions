class Solution {
    public boolean validPalindrome(String s) {
        int left=0,right=s.length()-1;
        while(left < right)
        {
            if(s.charAt(left) != s.charAt(right)){
                return isP(s.substring(0,left) + s.substring(left+1)) ||
                isP(s.substring(0,right) + s.substring(right+1));
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean isP(String s){
        int left=0,right=s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}