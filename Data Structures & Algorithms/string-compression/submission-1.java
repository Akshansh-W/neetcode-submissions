class Solution {
    public int compress(char[] chars) {
        int r=0,w=0;
        while(r < chars.length){
            char current = chars[r];
            int count = 0;

            while(r < chars.length && chars[r] == current){
                r++;
                count++;
            }

            chars[w] = current;
            w++;

            if(count > 1){
            String num = String.valueOf(count);
            for(char ch : num.toCharArray()){
                chars[w] = ch;
                w++;
            }
            }
        }
        return w;
    }
}