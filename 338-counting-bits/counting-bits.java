class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0; i<=n; i++){
            int k = i;
            int cnt = 0;
            while(k > 0){
                if((k&1) == 1){
                    cnt++;
                }
                k>>=1;
            }
            ans[i] = cnt;
        }
        return ans;
    }
}