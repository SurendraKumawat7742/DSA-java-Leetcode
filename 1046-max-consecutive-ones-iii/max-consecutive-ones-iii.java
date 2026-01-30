class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
//Brute force
        int maxCnt = 0;
        for(int i=0; i<n; i++){
            int zCnt = 0;
            for(int j=i; j<n; j++){
                if(nums[j] == 0){
                    zCnt++;
                }
                if(zCnt <= k){
                    maxCnt = Math.max(maxCnt, j-i+1);
                }else{
                    break;
                }
            }
        }
        return maxCnt;

//Optimized
        // int maxCnt = 0;
        // int zCnt = 0;
        // int left = 0;
        // for(int right=0; right<n; right++){
        //     if(nums[right] == 0){
        //         zCnt++;
        //     }
        //     while(zCnt > k){
        //         if(nums[left] == 0){
        //             zCnt--;
        //         }
        //         left++;
        //     }
        //     maxCnt = Math.max(maxCnt, right-left+1);
        // }
        // return maxCnt;
    }
}