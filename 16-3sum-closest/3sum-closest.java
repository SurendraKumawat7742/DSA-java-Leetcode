class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closeSum = Integer.MAX_VALUE/2;
        for(int i=0;i<n;i++){
            int j = i+1;
            int k = n-1;
            while(j < k){
                int total = nums[i] + nums[j] + nums[k];
                if(Math.abs(total - target) < Math.abs(closeSum - target)){
                    closeSum = total;
                }
                if(total < target){
                    j++;
                }else if(total > target){
                    k--;
                }else{
                    return total;
                }
            }
        }
        return closeSum;
    }
}