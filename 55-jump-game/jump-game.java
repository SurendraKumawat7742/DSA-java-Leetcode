class Solution {
    //public boolean canJump(int[] nums) {
//1st
        // int near = 0;
        // int far = 0;
        // while(far < nums.length-1){
        //     int farthest = 0;
        //     for(int i=near; i<=far; i++){
        //         farthest = Math.max(farthest , i+nums[i]);
        //     }
        //     near = far+1;
        //     far = farthest;
        //     if(near > far){
        //     return false;
        //     }
        // }
        // return true;
    // }

    static Map<Integer, Boolean> memo; //DP
    public boolean helper(int[] nums, int i){
        if(i == nums.length-1) return true;
        if(i >= nums.length || nums[i] == 0) return false;
        if(memo.containsKey(i)) return false;

        boolean res = false;
        for(int j=1; j<=nums[i]; j++){
            res = helper(nums, i+j);
            if(res) return true;
        }
        memo.put(i, false);
        return res;
    }
    public boolean canJump(int[] nums){
        memo = new HashMap<>();
        return helper(nums, 0);
    }
}