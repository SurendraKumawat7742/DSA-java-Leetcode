class Solution {
    public int minRemoval(int[] nums, int k) {
        int n = nums.length;
        int len = 0;
        Arrays.sort(nums);
        int left = 0;
        for(int i=0; i<n; i++){
            while(nums[i] > (long)k*nums[left]){
                left++;
            }
            len = Math.max(len, i-left+1);
        }
        return n-len;
    }
}