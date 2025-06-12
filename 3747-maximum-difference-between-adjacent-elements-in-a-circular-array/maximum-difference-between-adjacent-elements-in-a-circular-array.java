class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        if(n == 0 || n < 2){
            return 0;
        }
        int max = 0;
        for(int i=0; i<n; i++){
            int absDiff = Math.abs(nums[i]-nums[(i+1)%n]);
            max = Math.max(max, absDiff);
        }   
        return max;
    }
}