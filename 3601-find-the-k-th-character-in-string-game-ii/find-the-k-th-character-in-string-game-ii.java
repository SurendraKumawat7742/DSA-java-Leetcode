class Solution {
    public char kthCharacter(long k, int[] ope) {
        int ans = 0;
        int t;
        while (k != 1) {
            t = 63 - Long.numberOfLeadingZeros(k);
            if ((1L << t) == k) {
                t--;
            }
            k = k - (1L << t);
            if (ope[t] != 0) {
                ans++;
            }
        }
        return (char) ('a' + (ans % 26));
    }
}