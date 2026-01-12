class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n = points.length;
        int res = 0;
        for(int i=1; i<n; i++){
            int diffX = Math.abs(points[i][0]-points[i-1][0]);
            int diffY = Math.abs(points[i][1]-points[i-1][1]);
            if(diffX == diffY){
                res += diffX;
            }else if(diffX > diffY){
                res += diffX;
            }else{
                res += diffY;
            }
        }
        return res;
    }
}