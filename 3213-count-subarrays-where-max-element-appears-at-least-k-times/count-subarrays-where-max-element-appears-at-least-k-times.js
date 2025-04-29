/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var countSubarrays = function(nums, k) {
    let n = nums.length;
    const max = Math.max(...nums);
    let res = 0 , start = 0;
    let maxCount = 0;
    for(let end=0; end<n; end++){
        if(nums[end] == max){
            maxCount++;
        }
        while(maxCount == k){
            if(nums[start] == max){
                maxCount--;
            }
            start++;
        }
        res += start;
    }
    return res;
};