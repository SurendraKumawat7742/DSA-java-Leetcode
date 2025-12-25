class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n = happiness.length;
        int m = n-1;
        long res = 0;
        int i = 0;
        while(k > 0){
            if(happiness[m]-i >= 0){
                res += happiness[m]-i;
            }
            k--;
            m--;
            i++;
        }
        return res;
    }
}