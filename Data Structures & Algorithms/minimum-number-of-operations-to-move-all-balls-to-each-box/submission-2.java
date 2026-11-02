class Solution {
    public int[] minOperations(String b) {
        int[] ans = new int[b.length()];
        for(int i=0;i<b.length();i++){
            for(int j=0;j<b.length();j++){
                if(b.charAt(j) == '1'){
                    ans[i] += Math.abs(i - j);
                }
            }
        }
        return ans;
    }
}