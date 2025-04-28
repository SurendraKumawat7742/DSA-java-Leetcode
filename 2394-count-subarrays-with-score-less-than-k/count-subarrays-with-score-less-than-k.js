/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var countSubarrays = function(nums, k) {
    let n = nums.length;
    let res = 0;
    let total = 0;
    for(let i=0,j=0; j<n; j++){
        total += nums[j];
        while(i <= j && total * (j+1-i) >= k){
            total -= nums[i];
            i++;
        }
        res += (j+1-i);
    }
    return res;
};