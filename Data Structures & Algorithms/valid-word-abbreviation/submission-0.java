class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int wp = 0; // Pointer for word
        int ap = 0; // Pointer for abbr

        while (wp < word.length() && ap < abbr.length()) {
            if (Character.isDigit(abbr.charAt(ap))) {
                // Leading zero check
                if (abbr.charAt(ap) == '0') {
                    return false;
                }
                
                // Parse multi-digit numbers
                int num = 0;
                while (ap < abbr.length() && Character.isDigit(abbr.charAt(ap))) {
                    num = num * 10 + (abbr.charAt(ap) - '0');
                    ap++;
                }
                
                // Advance word pointer by the parsed number
                wp += num;
            } else {
                // Match single characters
                if (word.charAt(wp) != abbr.charAt(ap)) {
                    return false;
                }
                wp++;
                ap++;
            }
        }

        // Both pointers must reach the end of their respective strings
        return wp == word.length() && ap == abbr.length();
    }
}