class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        long s1 = 0 , zero1 = 0;
        long s2 = 0 , zero2 = 0;
        for(int i=0; i<n; i++){
            if(nums1[i] == 0){
                s1 ++;
                zero1++;
            }
            s1 += nums1[i];
        }
        for(int i=0; i<m; i++){
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
    }
}