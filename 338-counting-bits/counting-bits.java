class Solution {
    public int CountBits(int n){
        int cnt = 0;
        while(n > 0){
            if((n%2) == 1){
                cnt++;
            }
            n /= 2;
        }
        return cnt;
    }
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0; i<=n; i++){
            int cnt = CountBits(i);
            ans[i] = cnt;
        }
        return ans;
    }
}