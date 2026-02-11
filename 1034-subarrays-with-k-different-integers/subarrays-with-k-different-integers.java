class Solution {
    public int atMostK(int[] nums, int k){
        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        int cnt=0, left=0;
        for(int i=0; i<n; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
            while(mp.size() > k){
                mp.put(nums[left], mp.get(nums[left])-1);
                if(mp.get(nums[left]) == 0){
                    mp.remove(nums[left]);
                }
                left++;
            }
            cnt += i-left+1;
        }
        return cnt;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k-1);
    }
}