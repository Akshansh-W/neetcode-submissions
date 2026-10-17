class Solution {
    public int minimumRecolors(String blocks, int k) {
        int wCount = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                wCount++;
            }
        }
        int minRecolors = wCount;
        for (int r = k; r < blocks.length(); r++) {
            if (blocks.charAt(r) == 'W') {
                wCount++;
            }
            if (blocks.charAt(r - k) == 'W') {
                wCount--;
            }
            minRecolors = Math.min(minRecolors, wCount);
        }

        return minRecolors;
    }
}