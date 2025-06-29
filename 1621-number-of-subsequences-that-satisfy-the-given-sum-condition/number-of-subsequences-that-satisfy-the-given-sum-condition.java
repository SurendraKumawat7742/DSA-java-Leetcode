class Solution {
    public int numSubseq(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int mod = 1000000007;
        int[] pow = new int[n];
        pow[0] = 1;
        for(int i=1; i<n; i++){
            pow[i] = (pow[i-1]*2)%mod;
        }
        int left = 0, right = n-1, res = 0;
        while(left <= right){
            if(nums[left]+nums[right] <= target){
                res = (res + pow[right-left])%mod;
                left++;
            }else{
                right--;
            }
        }
        return res;
    }
}