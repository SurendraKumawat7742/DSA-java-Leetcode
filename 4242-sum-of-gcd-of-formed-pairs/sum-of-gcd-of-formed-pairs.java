class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] preGcd = new int[n];
        int max = nums[0];
        for(int i=0; i<n; i++){
            max = Math.max(max, nums[i]);
            preGcd[i] = gcd(max, nums[i]);
            // if(max < nums[i]){
            //     preGcd[i] = gcd(max, nums[i]);
            // }else{
            //     preGcd[i] = gcd(nums[i], max);
            // }
        }
        Arrays.sort(preGcd);
        long sum = 0;
        for(int i=0; i<n/2; i++){
            sum += gcd(preGcd[i], preGcd[n-i-1]);
        }
        return sum;
    }
    public int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}