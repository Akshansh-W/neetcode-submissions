class Solution {
    public int maxDifference(String s) {
        int maxOdd=Integer.MIN_VALUE,minEven=Integer.MAX_VALUE;
        HashMap<Character,Integer>map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch , map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()%2==0 && entry.getValue()<=minEven){
                minEven = entry.getValue();
            }
            if(entry.getValue()%2!=0 && entry.getValue()>=maxOdd){
                maxOdd = entry.getValue();
            }
        }
        return maxOdd-minEven;
    }
}