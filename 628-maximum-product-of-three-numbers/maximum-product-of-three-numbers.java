class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int pos = nums[n-1]*nums[n-2]*nums[n-3];
        
        if(nums[0]<0 && nums[1]<0 && nums[0]*nums[1]*nums[n-1] > pos){
            return nums[0]*nums[1]*nums[n-1];
        }
        return pos;
    }
}