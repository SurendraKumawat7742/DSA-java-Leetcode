class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
    //Brute Force
        // int res = 0;
        // for(int i=0; i<nums.size(); i++){
        //     int cnt = 0;
        //     for(int j=i; j<nums.size();j++){
        //         if(nums.get(j) % modulo == k){
        //             cnt++;
        //         }
        //         if(cnt % modulo == k){
        //             res++;
        //         }
        //     }
        // }
        // return res;


        int n = nums.size();
        Map<Integer, Integer> cnt = new HashMap<>();
        long res = 0;
        int prefix = 0;
        cnt.put(0,1);
        for(int i=0; i<n; i++){
            prefix += nums.get(i)%modulo == k? 1 : 0;
            res += cnt.getOrDefault((prefix-k+modulo)%modulo , 0);
            cnt.put(prefix % modulo , cnt.getOrDefault(prefix%modulo , 0)
            +1);
        }
        return res;
    }
}