class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] ans = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int r = (i-k < 0) ? 0 : i-k;
                int c = (j-k < 0) ? 0 : j-k;
                int endR = (i+k >= n) ? n-1 : i+k;
                int endC = (j+k >= m) ? m-1 : j+k;
                int sum = 0;
                for(int row=r; row<=endR; row++){
                    for(int col=c; col<=endC; col++){
                        sum += mat[row][col];
                    }
                }
                ans[i][j] = sum;
            }
        }
        return ans;
    }
}