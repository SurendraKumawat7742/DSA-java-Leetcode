class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        int prefix[] = new int[n+1];
        prefix[0] = 0;
        for(int i=1; i<=n; i++){
            prefix[i] = prefix[i-1] + nums[i-1];
        }
        for(int start=0; start<prefix.length; start++){
            for(int end=start+1; end<prefix.length; end++){
                if(prefix[end]-prefix[start] == k){
                    ans++;
                }
            }
        }
        return ans;
    }
}