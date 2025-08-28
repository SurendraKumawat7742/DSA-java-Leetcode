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
    public boolean canJump(int[] nums){
        int maxReach = 0;
        for(int i=0; i<nums.length; i++){
            if(i > maxReach) return false;
            maxReach = Math.max(maxReach, i + nums[i]);
        }
        return true;
    }
}