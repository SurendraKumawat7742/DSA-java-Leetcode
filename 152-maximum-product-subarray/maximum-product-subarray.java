class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int currMax = nums[0];
        int currMin = nums[0];
        int maxProd = nums[0];
        for(int i=1; i<n; i++){
            int temp = max(nums[i],nums[i]*currMax,nums[i]*currMin);
            currMin = min(nums[i],nums[i]*currMax,nums[i]*currMin);
            currMax = temp;
            maxProd = Math.max(maxProd, currMax);
        }
        return maxProd;
    }
    public int max(int a, int b, int c){
        int temp = Math.max(a, Math.max(b,c));
        return temp;
    }
    public int min(int a, int b, int c){
        int temp = Math.min(a, Math.min(b,c));
        return temp;
    }
}