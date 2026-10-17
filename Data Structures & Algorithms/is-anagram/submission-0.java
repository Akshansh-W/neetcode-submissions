class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char sValue = s.charAt(i);
            char tValue = t.charAt(i);

            map.put(sValue, map.getOrDefault(sValue,0)+1);
            map.put(tValue, map.getOrDefault(tValue,0)-1);
        }
        for(int value : map.values()){
            if(value != 0){
                return false;
            }
        }
        return true;
    }
}
