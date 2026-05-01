class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int f = 0;
        int numSum = 0;
        for(int i=0; i<n; i++){
            numSum += nums[i];
            f += i*nums[i];
        }

        int res = f;
        for(int i=n-1; i>=0; i--){
            f += numSum -(n*nums[i]);
            res = Math.max(res, f);
        }

        return res;
    }
}