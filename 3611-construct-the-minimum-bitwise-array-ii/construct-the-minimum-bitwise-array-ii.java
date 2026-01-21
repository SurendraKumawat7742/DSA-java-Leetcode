class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            int num = nums.get(i);
            int res = -1;
            int d = 1;
            while((num&d) != 0){
                res = num-d;
                d <<= 1;
            }
            ans[i] = res;
        }
        return ans;
    }
}