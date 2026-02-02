class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int preMod = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, -1);
        for(int i=0; i<n; i++){
            preMod = (preMod+nums[i])%k;
            if(mp.containsKey(preMod)){
                if(i-mp.get(preMod) > 1){
                    return true;
                }
            }else{
                mp.put(preMod, i);
            }
        }
        
        return false;
    }
}