class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2];
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<n; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
        }
        int j=0;
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            if(entry.getValue() == 1){
                ans[j] = entry.getKey();
                j++;
            }
        }
        return ans;
    }
}