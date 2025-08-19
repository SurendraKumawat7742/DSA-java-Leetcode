class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n = nums.length;
        long cnt=0;
        long sum = 0;
        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                cnt++;
                sum += cnt;
            }else{
                cnt = 0;
            }
        }
        return sum;
    }
}