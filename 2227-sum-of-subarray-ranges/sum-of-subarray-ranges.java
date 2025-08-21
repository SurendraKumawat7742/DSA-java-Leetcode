class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long res = 0;
        for(int i=0; i<n; i++){
            long minV = nums[i];
            long maxV = nums[i];
            for(int j=i; j<n; j++){
                minV = Math.min(minV, nums[j]);
                maxV = Math.max(maxV, nums[j]);
                res += maxV-minV;
            }
        }
        return res;
    }
}