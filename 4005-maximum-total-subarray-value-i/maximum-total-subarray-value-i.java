class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;
        long min = nums[0], max = nums[0];
        for(int i=1; i<n; i++){
            min = (long)Math.min(min, nums[i]);
            max = (long)Math.max(max, nums[i]);
        }
        return (max-min)*k;
    }
}