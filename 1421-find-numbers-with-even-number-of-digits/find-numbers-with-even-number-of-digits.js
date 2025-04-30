/**
 * @param {number[]} nums
 * @return {number}
 */
var findNumbers = function(nums) {
    let ans = 0;
    for(let num of nums){
        if((num >= 10 && num <= 99) || (num >= 1000 && num <= 9999) || num == 100000){
            ans++;
        }
    }
    return ans;
};