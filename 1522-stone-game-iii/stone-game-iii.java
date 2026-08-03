class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int[] dp = new int[n+1];
        for(int i=n-1; i>=0; i--){
            int max = Integer.MIN_VALUE;
            int currSum = 0;
            for(int j=0; j<3 && i+j <n; j++){
                currSum += stoneValue[i+j];
                max = Math.max(max, currSum-dp[i+j+1]);
            }
            dp[i] = max;
        }
        if(dp[0] > 0) return "Alice";
        else if(dp[0] < 0) return "Bob";
        else return "Tie";
    }
}