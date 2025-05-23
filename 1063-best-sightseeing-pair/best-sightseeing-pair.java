class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        // int max = 0;
        // int n = values.length;
        // int maxLeft = values[0];
        // for(int i=1; i<n; i++){
        //     int maxRight = values[i] - i;
        //     max = Math.max(max , maxLeft + maxRight);
        //     int currLeft = values[i]+i;
        //     maxLeft = Math.max(maxLeft , currLeft);
        // }
        // return max;


        int ans = Integer.MIN_VALUE;
        int m = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] - i + m > ans) 
                ans = values[i] - i + m;
            
            if (values[i] + i > m) 
                m = values[i] + i;
        }

        return ans;
    }
}