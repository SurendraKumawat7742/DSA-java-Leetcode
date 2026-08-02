class Solution {
    public int binaryS(long s, long[] pre){
        int st = 0, end = pre.length;
        int ans = 0;
        while(st < end){
            int mid = st+(end-st)/2;
            if(pre[mid] <= s){
                st = mid+1;
            }else{
                end = mid;
            }
        }
        return st;
    }
    public int[] countTasks(int[] tasks, int[] shifts) {
        int t = tasks.length;
        int s = shifts.length;
        long[] pre = new long[t];
        pre[0] = tasks[0];
        for(int i=1; i<t; i++){
            pre[i] = pre[i-1]+tasks[i];
        }
        int[] ans = new int[s];
        long curr = 0;
        for(int i=0; i<s; i++){
            if(curr+shifts[i] >= pre[t-1]){
                ans[i] = 0;
                curr = 0;
            }else{
                curr += shifts[i];
                int cnt = binaryS(curr, pre);
                ans[i] = t-cnt;
            }
        }
        return ans;
    }
}