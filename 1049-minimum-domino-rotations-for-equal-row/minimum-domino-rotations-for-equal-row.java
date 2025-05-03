class Solution {
    private int find(int[] tops , int[] bottoms , int val){
        int n = tops.length;
        int swapTop = 0;
        int swapBott = 0;
        for(int i=0; i<n; i++){
            if(tops[i] != val && bottoms[i] != val){
                return -1;
            }
            if(tops[i] != val){
                swapTop++;
            }
            if(bottoms[i] != val){
                swapBott++;
            }
        }
        return Math.min(swapTop , swapBott);
    }
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int res = Integer.MAX_VALUE;
        for(int val=1; val<=6; val++){
            int steps = find(tops , bottoms , val);
            if(steps != -1){
                res = Math.min(res , steps);
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}