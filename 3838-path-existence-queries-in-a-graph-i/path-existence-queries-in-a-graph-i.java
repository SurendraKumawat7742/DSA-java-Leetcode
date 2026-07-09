class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        boolean[] ans = new boolean[queries.length];
        int i = 0;
        for(int[] q : queries){
            int l, r;
            if(q[0] < q[1]){
                l = q[0];
                r = q[1];
            }else{
                l = q[1];
                r = q[0];
            }
            if(Math.abs(nums[r]-nums[l]) <= maxDiff){
                ans[i] = true;
            }else{
                boolean isTrue = true;
                for(int j=l+1; j<=r; j++){
                    if(Math.abs(nums[j]-nums[j-1]) > maxDiff){
                        isTrue = false;
                        break;
                    }
                }
                if(isTrue){
                    ans[i] = true;
                }else{
                    ans[i] = false;
                }
            }
            i++;
        }
        return ans;
    }
}