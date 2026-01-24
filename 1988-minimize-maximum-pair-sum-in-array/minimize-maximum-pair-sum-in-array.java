class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int j = nums.length-1;
        for(int i=0; i<nums.length/2; i++){
            max = Math.max(max, nums[i]+nums[j]);
            j--;
        }
        return max;
    }
}