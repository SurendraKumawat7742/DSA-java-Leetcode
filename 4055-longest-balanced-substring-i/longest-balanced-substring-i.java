class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int[] cnt = new int[26];
        int maxLen = 0;
        for(int i=0; i<n; i++){
            Arrays.fill(cnt, 0);
            for(int j=i; j<n; j++){
                boolean is = true;
                int c = s.charAt(j)-'a';
                cnt[c]++;
                for(int x : cnt){
                    if(x > 0 && x != cnt[c]){
                        is = false;
                        break;
                    }
                }
                if(is){
                    maxLen = Math.max(maxLen, j-i+1);
                }
            }
        }
        return maxLen;
    }
}