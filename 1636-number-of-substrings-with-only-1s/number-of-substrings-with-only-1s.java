class Solution {
    public int numSub(String s) {
        int MOD = 1000000007;
        long cnt = 0;
        long res = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                cnt++;
            }else{
                res += (cnt*(cnt+1)/2)%MOD;
                cnt = 0;
            }
        }
        res += (cnt*(cnt+1)/2)%MOD;
        return (int)res;
    }
}