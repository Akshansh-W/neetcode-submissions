class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] mCount = new int[26];
        int[] rCount = new int[26];
        for(char ch : magazine.toCharArray()){
            mCount[ch - 'a']++;
        }
        for(char ch : ransomNote.toCharArray()){
            rCount[ch - 'a']++;
        }
        for(int i=0;i<26;i++){
            if(!(mCount[i] >= rCount[i])){
                return false;
            }
        }
        return true;

    }
}