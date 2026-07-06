class Solution {
    public int removeCoveredIntervals(int[][] inte) {
        Arrays.sort(inte, (a,b) -> a[0]!=b[0] ? a[0]-b[0] : b[1]-a[1]);
        int res = 0, last = 0;

        for(int[] val : inte){
            if(val[1] > last){
                last = val[1];
                res++;
            }
        }
        
        return res;
    }
}