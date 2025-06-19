class Solution {
    public int partitionArray(int[] nums, int k) {
//1st
        // Arrays.sort(nums);
        // int count = 1;
        // int n = nums.length;
        // int j = 0;
        // for(int i=0; i<n; i++){
        //     if(nums[i]-nums[j] > k){
        //         count++;
        //         j = i;
        //     }
        // }
        // return count;

//2nd
        Arrays.sort(nums);
        int i = 0, j = 0, count = 0;
        int n = nums.length;
        while (j < n) {
            if (nums[j] - nums[i] > k) {
                count++;
                i = j;
            }
            j++;
        }
        return count + 1;
    }
}