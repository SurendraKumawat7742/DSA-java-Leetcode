class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        // for(int[] query : queries){
        //     int left = query[0];
        //     int right = query[1];
        //     for(int i=left; i<right; i++){
        //         nums[i] -= 1;
        //     }
        // }
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] != 0){
        //         return false;
        //     }
        // }
        // return true;


        int arr[] = new int[nums.length + 1];
        for(int[] query : queries){
            int left = query[0];
            int right = query[1];
            arr[left] += 1;
            arr[right+1] -= 1;
        }
        int currOpe[] = new int[arr.length];
        int countOpe = 0;
        for(int i=0; i<arr.length; i++){
            countOpe += arr[i];
            currOpe[i] = countOpe;
        }
        for(int i=0; i<nums.length; i++){
            if(currOpe[i] < nums[i]){
                return false;
            }
        }
        return true;
    }
}