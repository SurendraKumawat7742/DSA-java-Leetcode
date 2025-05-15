/**
 * @param {string[]} words
 * @param {number[]} groups
 * @return {string[]}
 */
var getLongestSubsequence = function(words, groups) {
    let ans = [];
    let n = groups.length;
    for(let i=0; i<n; i++){
        if(i == 0 || groups[i] != groups[i-1]){
            ans.push(words[i]);
        }
    }
    return ans;
};