class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int res = nums[0];
        int maxSum = nums[0];
        for(int i=1; i<n; i++){
            maxSum = Math.max(maxSum+nums[i], nums[i]);
            res = Math.max(maxSum, res);
        }
        return res;
    }
}