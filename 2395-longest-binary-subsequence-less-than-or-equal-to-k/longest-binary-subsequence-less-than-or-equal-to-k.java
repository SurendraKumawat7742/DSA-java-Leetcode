class Solution {
    public int longestSubsequence(String s, int k) {
        int n = s.length();
        int ans=0;
        int power=0;
        long value=0;
        for(int i=n-1; i>=0; i--){
            char c = s.charAt(i);
            if(c == '0'){
                ans++;
                power++;
            }else{
                if(power < 31 && (value+(1L << power)) <= k){
                    value += (1L << power); 
                    ans++;
                    power++;
                }else{
                    power++;
                }
                
            }
            
        }
        return ans;
    }
}