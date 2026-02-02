class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int preMod = 0;
        int cnt = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        for(int i=0; i<n; i++){
            preMod = (preMod+nums[i])%k;
            if(preMod < 0){
                preMod += k;
            }
            if(mp.containsKey(preMod)){
                cnt += mp.get(preMod);
            }
            mp.put(preMod, mp.getOrDefault(preMod,0)+1);
        }
        return cnt;
    }
}