class Solution {
    public int majorityElement(int[] nums) {
        // int majority = nums[0], lead =1;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i] == majority){
        //         lead++;
        //     }
        //     else if(lead>0){
        //         lead--;
        //     }else{
        //         majority = nums[i];
        //         lead=1;
        //     }
        // }
        // return majority;


    //2nd
        int cnt = 1; 
        int n = nums.length;
        int k = n/2;
        Arrays.sort(nums);
        int res = nums[0];
        for(int i=1; i<n; i++){
            if(nums[i] == nums[i-1]){
                cnt++;
            }else{
                cnt = 1;
            }
            if(cnt > k){
                res = nums[i];
            }
        }
        return res;
    }
}