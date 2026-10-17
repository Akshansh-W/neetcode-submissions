class Solution {
    public boolean isPalindrome(String s) {
        String sp = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = sp.length()-1;
        while(left<right){
            if(sp.charAt(left) != sp.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}
