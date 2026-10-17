class Solution {
    public int maxNumberOfBalloons(String text) {
     int[] count = new int[26];
     int ans = Integer.MAX_VALUE;
     for(char ch : text.toCharArray()){
        count[ch - 'a']++;
     }

     for(char ch : "balon".toCharArray()){
        int freq = count[ch-'a'];
        if(ch == 'l' || ch == 'o'){
            freq /= 2;
        }
        ans = Math.min(freq,ans);
     }
     return ans;
    }
    
}