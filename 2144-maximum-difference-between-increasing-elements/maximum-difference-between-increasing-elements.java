class Solution {
    public int maximumDifference(int[] nums) {
    //Brute force
        // int n = nums.length;
        // int max = -1;
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         if(nums[i] < nums[j]){
        //             max = Math.max(max, (nums[j]-nums[i]));
        //         }
        //     }
        // }
        // return max;

    //Optimized
        int n = nums.length;
        int i=0;
        int max=0;
        for(int j=1; j<n; j++){
            if(j > i && nums[j] > nums[i]){
                int temp = nums[j]-nums[i];
                if(temp > max){
                    max = temp;
                }
            }else{
                i=j;
            } 
        }
        if(max == 0){
            return -1;
        }
        return max;
    }
}