class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        List<Integer> ans = new ArrayList<>();
        int n = security.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int cnt =0 ;
        for(int i=1; i<n; i++){
            if(security[i] <= security[i-1]){
                cnt++;
                prefix[i] = cnt;
            }else{
                cnt =0 ;
            }
        }
        cnt = 0;
        for(int i=n-2; i>=0; i--){
            if(security[i] <= security[i+1]){
                cnt++;
                suffix[i] = cnt;
            }else{
                cnt=0;
            }
        }
        for(int i=0; i<n; i++){
            if(prefix[i] >= time && suffix[i] >= time){
                ans.add(i);
            }
        }
        return ans;
    }
}