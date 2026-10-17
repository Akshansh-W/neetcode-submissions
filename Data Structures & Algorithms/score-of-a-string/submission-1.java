class Solution {
    public int scoreOfString(String s) {
      int i=0,j=1,score=0;
      while(j < s.length()){
        score += Math.abs( (int)s.charAt(i) - (int)s.charAt(j) );
        i++;
        j++;
      }
      return score;
    }
}