class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 1;
        int n = nums.length;
        int j = 0;
        for(int i=0; i<n; i++){
            if(nums[i]-nums[j] > k){
                count++;
                j = i;
            }
        }
        return count;
    }
}