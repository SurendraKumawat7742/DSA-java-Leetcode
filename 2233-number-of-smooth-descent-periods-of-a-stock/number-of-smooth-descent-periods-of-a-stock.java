class Solution {
    public long getDescentPeriods(int[] prices) {
        int n = prices.length;
        int prev = 1;
        long res = 1;
        for(int i=1; i<n; i++){
            if(prices[i]+1 == prices[i-1]){
                prev++;
            }else{
                prev = 1;
            }
            res += prev;
        }
        return res;
    }
}