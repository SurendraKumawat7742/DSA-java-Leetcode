class Solution {
    public int repeatedNTimes(int[] nums) {
//1st
        // Map<Integer, Integer> map = new HashMap<>();
        // int n = nums.length/2;
        // int res = 0;
        // for(int i=0; i<nums.length; i++){
        //     map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        //     if(map.get(nums[i]) == n){
        //         res = nums[i];
        //         break;
        //     }
        // }
        // return res;

//2nd
        Set<Integer> set = new HashSet<>();
        for(int x : nums){
            if(!set.add(x)){
                return x;
            }
        }
        return nums[nums.length-1];
    }
}