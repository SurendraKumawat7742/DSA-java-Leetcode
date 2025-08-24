class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int zeroCnt = 0, longestWin = 0, start = 0;
        for(int i=0; i<=n-1; i++){
            if(nums[i] == 0){
                zeroCnt++;
            }
            while(zeroCnt > 1){
                zeroCnt -= (nums[start]==0)?1:0;
                start++;
            }
            longestWin = Math.max(longestWin, i-start);
        }
        return longestWin;
    }
}