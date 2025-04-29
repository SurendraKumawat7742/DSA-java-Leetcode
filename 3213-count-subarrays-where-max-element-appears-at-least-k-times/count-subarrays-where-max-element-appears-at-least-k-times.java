class Solution {
    public long countSubarrays(int[] nums, int k) {
    // Brute force
    int max = 0;
    int n = nums.length;
    for(int i=0;i<n;i++){
        max = Math.max(max , nums[i]);
    }
    long res = 0 , start = 0;
    int maxCount = 0;
    for(int end=0; end<n; end++){
        if(nums[end] == max){
            maxCount++;
        }
        while(maxCount == k){
            if(nums[(int) start] == max){
                maxCount--;
            }
            start++;
        }
        res += start;
    }
    return res;
    }
}