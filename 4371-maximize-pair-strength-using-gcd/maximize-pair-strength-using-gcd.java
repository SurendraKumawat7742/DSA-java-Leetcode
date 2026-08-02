class Solution {
    public long maxPairStrength(int[] nums) {
        int n = nums.length;
        long res = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                long div = gcd((long)nums[i],nums[j]);
                long mul = ((long)nums[i]*(long)nums[j]);
                res = Math.max(res, mul/(div*div));
            }
        }
        return res;
    }
    public long gcd(long a, long b){
        while(b > 0){
            long temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}