class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max = 0;
        int n = values.length;
        int maxLeft = values[0];
        for(int i=1; i<n; i++){
            int maxRight = values[i] - i;
            max = Math.max(max , maxLeft + maxRight);
            int currLeft = values[i]+i;
            maxLeft = Math.max(maxLeft , currLeft);
        }
        return max;
    }
}