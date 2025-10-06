class Solution {
    public int numSub(String s) {
        int MOD = 1000000007;
        long cnt = 0;
        long res = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                cnt++;
            }else{
                long add = (cnt*(cnt+1)/2);
                add = add % MOD;
                res += add;
                cnt = 0;
            }
        }
        long add = (cnt*(cnt+1)/2);
        add = add % MOD;
        res += add;
        return (int)res;
    }
}