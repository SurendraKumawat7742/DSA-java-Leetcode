class Solution {
    public int maxAdjacentDistance(int[] nums) {
//Ist
        // int n = nums.length;
        // if(n == 0 || n < 2){
        //     return 0;
        // }
        // int max = 0;
        // for(int i=0; i<n; i++){
        //     int absDiff = Math.abs(nums[i]-nums[(i+1)%n]);
        //     max = Math.max(max, absDiff);
        // }   
        // return max;

//IInd
        int n = nums.length;
        int res = Math.abs(nums[0] - nums[n - 1]);
        for (int i = 0; i < n - 1; ++i) {
            res = Math.max(res, Math.abs(nums[i] - nums[i + 1]));
        }
        return res;
    }
}