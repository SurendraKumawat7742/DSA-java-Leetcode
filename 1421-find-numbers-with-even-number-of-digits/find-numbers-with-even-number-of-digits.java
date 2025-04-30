class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int num : nums){
            int count = 0;
            while(num != 0){
                num /= 10;
                count++;
            }
            if(count % 2 == 0){
                ans++;
            }
        }
        return ans;
    }
}