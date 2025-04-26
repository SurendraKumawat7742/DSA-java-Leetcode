/**
 * @param {number[]} nums
 * @param {number} minK
 * @param {number} maxK
 * @return {number}
 */
var countSubarrays = function(nums, minK, maxK) {
    let count = 0;
    let start = -1 , mini = -1 , maxi = -1;
    for(let i=0; i<nums.length; i++){
        if(nums[i] < minK || nums[i] > maxK){
            start = i;
        }
        if(nums[i] == minK){
            mini = i;
        }
        if(nums[i] == maxK){
            maxi = i;
        }
        let valid = Math.min(mini , maxi);
        if(valid > start){
            count += valid - start;
        }
    }
    return count;
};