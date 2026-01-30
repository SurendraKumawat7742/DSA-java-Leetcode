class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int maxCnt = 0;
        int zCnt = 0;
        int left = 0;
        for(int right=0; right<n; right++){
            if(nums[right] == 0){
                zCnt++;
            }
            while(zCnt > k){
                if(nums[left] == 0){
                    zCnt--;
                }
                left++;
            }
            maxCnt = Math.max(maxCnt, right-left+1);
        }
        return maxCnt;
    }
}