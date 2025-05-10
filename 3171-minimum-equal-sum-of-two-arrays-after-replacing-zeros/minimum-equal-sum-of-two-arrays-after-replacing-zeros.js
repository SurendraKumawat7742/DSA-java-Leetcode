/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var minSum = function(nums1, nums2) {
        let n = nums1.length;
        let m = nums2.length;
        let s1 = 0 , zero1 = 0;
        let s2 = 0 , zero2 = 0;
        for(let i=0; i<n; i++){
            if(nums1[i] == 0){
                s1 ++;
                zero1++;
            }
            s1 += nums1[i];
        }
        for(let i=0; i<m; i++){
            if(nums2[i] == 0){
                s2 ++;
                zero2++;
            }
            s2 += nums2[i];
        }
        if((zero1 == 0 && s2 > s1) || (zero2 == 0 && s1 > s2)){
            return -1;
        }
        return Math.max(s1 , s2);
};