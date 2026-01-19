class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int n = mat.length;
        int m = mat[0].length;

        int[][] preSum = new int[n+1][m+1];

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                preSum[i][j] = mat[i-1][j-1]+preSum[i-1][j]+preSum[i][j-1]
                                -preSum[i-1][j-1];
            }
        }
        int maxSide = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                int nxtSide = maxSide+1;
                if(i >= nxtSide && j >= nxtSide){
                    int sum = preSum[i][j]-preSum[i-nxtSide][j]
                        -preSum[i][j-nxtSide]+preSum[i-nxtSide][j-nxtSide];

                    if(sum <= threshold){
                    maxSide = nxtSide;
                }
                }
               
            }
        }
        return maxSide;
    }
}