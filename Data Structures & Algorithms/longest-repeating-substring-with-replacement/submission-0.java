class Solution {
    public int characterReplacement(String s, int k) {
    int[] count = new int[26];
    int maxFrequency=0,maxLength=0,left=0;
    for(int right = 0;right<s.length();right++){

        char currCharacter = s.charAt(right);
        count[currCharacter - 'A']++;

        maxFrequency = Math.max(maxFrequency,count[currCharacter-'A']);
        int windowLength = right-left+1;
        if(windowLength - maxFrequency > k){
            count[s.charAt(left) - 'A']--;
            left++;
        }
        maxLength = Math.max(maxLength,right-left+1);
    }
    return maxLength;
    }
}
