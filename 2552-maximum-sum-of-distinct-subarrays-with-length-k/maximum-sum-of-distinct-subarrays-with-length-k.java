class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;
        long currSum = 0;
        int st = 0;
        int end = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        while(end < nums.length){
            int num = nums[end];
            int lastOccu = mp.getOrDefault(num, -1);
            while(st <= lastOccu || end-st+1 > k){
                currSum -= nums[st];
                st++;
            }
            mp.put(num, end);
            currSum += num;
            if(end-st+1 == k){
                maxSum = Math.max(maxSum, currSum);
            }
            end++;
        }
        return maxSum;
    }
}