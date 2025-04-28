class Solution {
    public long countSubarrays(int[] nums, long k) {
    //    long count = 0;
    //   int i=0;
    //   while(i < nums.length){
    //     int j = i;
    //     int sum = 0;
    //     while(j < nums.length){
    //         sum += nums[j];
    //         if(sum * (j+1-i) < k){
    //             count++;
    //         }
    //         j++;
    //     }
    //     i++;
    //   }
    //    return count;


//Sliding window
    int n = nums.length;
    long res = 0;
    long total = 0;
    for(int i=0,j=0; j<n; j++){
        total += nums[j];
        while(i <= j && total * (j+1-i) >= k){
            total -= nums[i];
            i++;
        }
        res += (j+1-i);
    }
    return res;
    }
}