class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
    //1st :- Brute force
        // int n = nums1.length;
        // int m = nums2.length;

        // int max = 0;
        // for(int i=0; i<n; i++){
        //     for(int j=i; j<m; j++){
        //         if(nums1[i] <= nums2[j]){
        //             max= Math.max(max, j-i);
        //         }
        //     }
        // }
        // return max;
    //2nd : BinarySearch
        // int n = nums1.length;
        // int m = nums2.length;

        // int max = 0;
        // for(int i=0; i<n; i++){
        //     int left = 0, right = m-1, idx = 0;
        //     while(left <= right){
        //         int mid = left+(right-left)/2;
        //         if(nums1[i] <= nums2[mid]){
        //             if(mid >= i){
        //                 max = Math.max(max, mid-i);
        //             }
        //             left = mid+1;
        //         }else{
        //             right = mid-1;
        //         }
        //     }
        // }
        // return max;

    //3rd : Two pointer
        int max = 0;
        int i=0, j=0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] <= nums2[j]){
                max = Math.max(max, j-i);
                j++;
            }else{
                i++;
            }
        }
        return max;
    }
}