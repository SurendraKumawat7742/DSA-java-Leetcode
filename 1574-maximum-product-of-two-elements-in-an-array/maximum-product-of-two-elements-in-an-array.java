class Solution {
    public int maxProduct(int[] nums) {
        // int max1 = Integer.MIN_VALUE;
        // int max2 = Integer.MIN_VALUE;
        // for(int num : nums){
        //     if(num >= max1){
        //         max1 = num;
        //         max2 = max1;
        //     }else if(num > max2){
        //         max2 = num;
        //     }
        // }
        // return (max1 - 1)*(max2 - 1);

        int n = nums.length;
        Arrays.sort(nums);
        return (nums[n-1]-1)*(nums[n-2]-1);
    }
}