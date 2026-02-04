class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int currMax = nums[0];
        int currMin = nums[0];
        int maxProd = nums[0];
        for(int i=1; i<n; i++){
            int temp = Math.max(nums[i],Math.max(nums[i]*currMax,nums[i]*currMin));
            currMin = Math.min(nums[i],Math.min(nums[i]*currMax,nums[i]*currMin));
            currMax = temp;
            maxProd = Math.max(maxProd, currMax);
        }
        return maxProd;
    }
}