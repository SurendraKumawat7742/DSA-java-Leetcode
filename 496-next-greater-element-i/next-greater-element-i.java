class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] res = new int[n];

        for(int i=0; i<n; i++){
            int j = 0;
            while(nums1[i] != nums2[j] && j < m-1){
                    j++;
            }
            for(int k=j+1; k<m; k++){
                
                if(nums2[k] > nums1[i]){
                    res[i] = nums2[k];
                    break;
                }
            }
            if(res[i] <= nums1[i]){
                res[i] = -1;
            }
        }
        return res;
    }
}