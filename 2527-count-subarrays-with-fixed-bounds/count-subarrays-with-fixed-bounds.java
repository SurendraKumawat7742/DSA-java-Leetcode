class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
    //Brute Force
        // int count = 0;
        // for(int i=0; i<nums.length; i++){
        //     int mini = Integer.MAX_VALUE;
        //     int maxi = Integer.MIN_VALUE;
        //     for(int j=i; j<nums.length; j++){
        //         mini = Math.min(mini , nums[j]);
        //         maxi = Math.max(maxi , nums[j]);
        //         if(mini == minK && maxi == maxK){
        //             count++;
        //         }
        //     }
        // }
        // return count;


    //Optimized
        long count = 0;
        int start = -1 , mini = -1 , maxi = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < minK || nums[i] > maxK) start = i;
            if(nums[i] == maxK) maxi = i;
            if(nums[i] == minK) mini = i;
            int valid = Math.max(0 , Math.min(mini,maxi)-start);
            count += valid;
        }
        return count;
    }
}