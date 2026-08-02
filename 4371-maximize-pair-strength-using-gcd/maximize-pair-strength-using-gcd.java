class Solution {
    public long maxPairStrength(int[] nums) {
        int n = nums.length;
        long res = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                long f = (long)nums[i];
                long s = (long)nums[j];
                long div = gcd(f,s);
                res = Math.max(res, (f/div)*(s/div));
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