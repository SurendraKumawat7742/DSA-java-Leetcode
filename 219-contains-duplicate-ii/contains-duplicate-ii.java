class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
//1st
        // Set<Integer> set = new HashSet<>();
        // Map<Integer, Integer> mp = new HashMap<>();
        // for(int i=0; i<nums.length; i++){
        //     if(set.contains(nums[i])){
        //         int idx1 = mp.get(nums[i]);
        //         int idx2 = i;
        //         if(Math.abs(idx1-idx2) <= k){
        //             return true;
        //         }
        //         mp.put(nums[i], i);
        //     }else{
        //         mp.put(nums[i], i);
        //         set.add(nums[i]);
        //     }
        // }
        // return false;


//2nd
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }
            
            if (!set.add(nums[i])) {
                return true;
            }
        }
        
        return false;
    }
}