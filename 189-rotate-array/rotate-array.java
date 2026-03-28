class Solution {
    public void rotate(int[] nums, int k) {
    //1st
        // int n = nums.length;
        // k %= n;
        // List<Integer> list = new ArrayList<>();
        // for(int i=n-k; i<n; i++){
        //     list.add(nums[i]);
        // }
        // for(int i=0; i<n-k; i++){
        //     list.add(nums[i]);
        // }

        // for(int i=0; i<n; i++){
        //     nums[i] = list.get(i);
        // }


    //2nd
        int n = nums.length;
        k %= n;

        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }

    public void reverse(int[] nums, int st, int end){
        while(st < end){
            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;

            st++;
            end--;
        }
    }
}