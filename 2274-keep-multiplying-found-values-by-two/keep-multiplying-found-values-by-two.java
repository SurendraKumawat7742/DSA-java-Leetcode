class Solution {
    public int findFinalValue(int[] nums, int original) {
    //1st
        // Arrays.sort(nums);
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] == original){
        //         original *= 2;
        //     }
        // }
        // return original;

    //2nd
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
            while(set.contains(original)){
                original *= 2;
            }
        }
        return original;
    }
}