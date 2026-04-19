class Solution {
    public int leastInterval(char[] tasks, int n) {
        int len = tasks.length;
        int[] freq = new int[26];
        int maxFreq = 0;
        for(char c : tasks){
            freq[c-'A']++;
            maxFreq = Math.max(maxFreq, freq[c-'A']);
        }
        int cntMaxFreq = 0;
        for(int f : freq){
            if(f == maxFreq){
                cntMaxFreq++;
            }
        }

        int res = (maxFreq-1)*(n+1) + cntMaxFreq;

        return Math.max(res, len);
    }
}