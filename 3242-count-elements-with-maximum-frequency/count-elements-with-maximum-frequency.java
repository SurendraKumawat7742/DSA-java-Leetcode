class Solution {
    public int maxFrequencyElements(int[] nums) {
        int m = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<m; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
        }
        int max = 0;
        for(int n : nums){
            max = Math.max(max, mp.get(n));
        }
        int res = 0;
        for(int n : mp.values()){
            if(n == max){
                res += n;
            }
        }
        return res;
    }
}