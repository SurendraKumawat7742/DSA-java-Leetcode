class Solution {
    public int specialTriplets(int[] nums) {
//Worst : O(n^3)
        // int n = nums.length;
        // int ans = 0;
        // for(int i=0; i<n-2; i++){
        //     for(int j=i+1; j<n-1; j++){
        //         for(int k=j+1; k<n; k++){
        //             if(nums[i] == nums[j]*2 && nums[k] == nums[j]*2){
        //                 ans++;
        //             }
        //         }
        //     }
        // }
        // return ans;


//Optimized
        final int MOD = 1000000007;
        Map<Integer, Integer> right = new HashMap<>();
        Map<Integer, Integer> left = new HashMap<>();

        for (int x : nums) {
            right.put(x, right.getOrDefault(x, 0) + 1);
        }

        long ans = 0;
        for (int v : nums) {
            int target = v * 2;
            int lCnt = left.getOrDefault(target, 0);
            left.put(v, left.getOrDefault(v, 0) + 1);
            int rCnt =
                right.getOrDefault(target, 0) -
                left.getOrDefault(target, 0);
            ans = (ans + (long) lCnt * rCnt) % MOD;
        }

        return (int) ans;
    }
}