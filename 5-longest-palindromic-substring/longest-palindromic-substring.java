class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n <= 1) return s;

        int st = 0, maxLen = 1;

        for(int i = 0; i < n; i++) {
            // Even length palindrome (center at i, i+1)
            int l = i, r = i + 1;
            while(l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                if(r - l + 1 > maxLen) {
                    st = l;
                    maxLen = r - l + 1;
                }
                l--;
                r++;
            }

            // Odd length palindrome (center at i)
            l = i - 1;
            r = i + 1;
            while(l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                if(r - l + 1 > maxLen) {
                    st = l;
                    maxLen = r - l + 1;
                }
                l--;
                r++;
            }
        }
        return s.substring(st, st + maxLen);
    }
}