class Solution {
    public int maxDifference(String s) {
        int n = s.length();
        int[] cnt = new int[26];
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            cnt[c-'a']++;
        }
        
        int minE=100,maxO=0;
        
        for(int i=0; i<26; i++){
            if(cnt[i] != 0){
                if(cnt[i]%2 == 0){
                    minE = Math.min(minE,cnt[i]);
                }
                if(cnt[i]%2 != 0){
                    maxO = Math.max(maxO,cnt[i]);
                }
            }
        }
        // int a=0,b=0;
        // if(maxE < maxO){
        //     a = maxO;
        // }
        // if(minE < minO){
        //     b = minE;
        // }
        
        return (maxO-minE);
        // return a-b;
    }
}