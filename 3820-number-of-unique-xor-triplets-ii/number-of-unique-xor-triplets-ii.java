class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        int max = 0;
        for(int num : nums){
            max = Math.max(max, num);
        }
        int m = 1;
        while(m <= max){
            m <<= 1;
        }
        boolean[] first = new boolean[m];
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                first[nums[i]^nums[j]] = true;
            }
        }
        boolean[] res = new boolean[m];
        for(int x=0; x<m; x++){
            if(!first[x]){
                continue;
            }
            for(int num : nums){
                res[num^x] = true;
            }
        }
        int ans = 0;
        for(int i=0; i<m; i++){
            if(res[i]){
                ans++;
            }
        }
        return ans;
    }
}