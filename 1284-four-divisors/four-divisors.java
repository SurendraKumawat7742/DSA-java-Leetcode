class Solution {
    public int sumFourDivisors(int[] nums) {
        int res = 0;
        
        for(int i=0; i<nums.length; i++){
            int sum = 0;
            int n = nums[i];
            int cnt = 0;
            for(int j=1; j*j<=n; j++){
                if(n%j == 0){
                    int k = n/j;
                    cnt++;
                    sum += j;
                    if(j != k){
                        cnt++;
                        sum += k;
                    }
                }
            }
            if(cnt == 4){
                res += sum;
            }
        }
        return res;
    }
}