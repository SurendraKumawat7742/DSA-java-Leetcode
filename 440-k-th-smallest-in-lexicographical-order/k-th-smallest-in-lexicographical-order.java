class Solution {
    public int findKthNumber(int n, int k) {
        int curr = 1;
        k--;
        while(k > 0){
            int step = cntStep(n,curr,curr+1);
            if(step <= k){
                curr++;
                k -= step;
            }else{
                curr *= 10;
                k--;
            }
        }
        return curr;
    }
    public int cntStep(int n,long pre1,long pre2){
        int steps = 0;
        while(pre1 <= n){
            steps += Math.min((n+1),pre2)-pre1;
            pre1 *= 10;
            pre2 *= 10;
        }
        return steps;
    }
}