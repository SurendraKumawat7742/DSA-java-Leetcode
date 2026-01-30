class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        int product = 1;
        int left = 0;
        for(int right=0; right<n; right++){
            product *= nums[right];
            while(left <= right && product >= k){
                product /= nums[left];
                left++;
            }
            if(product < k){
                ans += right-left+1;
            }
        }
        return ans;
    }
}