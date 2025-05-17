class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
    //Ist approach
        // for(int i=0; i<n; i++){
        //     int minPos = i;
        //     for(int j=i+1; j<n; j++){
        //         if(nums[minPos] > nums[j]){
        //             minPos = j;
        //         }
        //     }
        //     int temp = nums[i];
        //     nums[i] = nums[minPos];
        //     nums[minPos] = temp;
        // }

    //II nd approach
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                mid++;
                low++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
    }
}