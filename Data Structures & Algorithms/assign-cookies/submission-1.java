class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int gp = 0;
        int sp = 0;
        int ans = 0;
        Arrays.sort(g);
        Arrays.sort(s);

        while(gp != g.length && sp != s.length){
            if(s[sp] >= g[gp]){
                sp++;
                gp++;
                ans++;
            }else{
                sp++;
            }
        }
        return ans;
    }
}