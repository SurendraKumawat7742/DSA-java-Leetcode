class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        final int MOD = 12345;
        int n = grid.length;
        int m = grid[0].length;
        int[][] p = new int[n][m];

        long[] pre = new long[n*m];
        pre[0] = grid[0][0]%MOD;
        int pIdx = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i==0 && j==0){
                    continue;
                }
                pre[pIdx] = (pre[pIdx-1]*grid[i][j]) % MOD;
                pIdx++;
            }
        }

        long[] suff = new long[n*m];
        suff[(n*m)-1] = grid[n-1][m-1] % MOD;
        int sIdx = (n*m)-2;
        for(int i=n-1; i>=0; i--){
            for(int j=m-1; j>=0; j--){
                if(i == n-1 && j == m-1){
                    continue;
                }
                suff[sIdx] = (suff[sIdx+1]*grid[i][j]) % MOD;
                sIdx--;
            }
        }

        int i = 0, j = 1;
        p[0][0] = (int)suff[1] % MOD;
        p[n-1][m-1] = (int)pre[(n*m)-2]% MOD;
        for(int idx=1; idx<n*m-1; idx++){
            if(j == m){
                j = 0;
                i++;
            }
            p[i][j] = (int)(pre[idx-1]*suff[idx+1]) % MOD;
            j++;
        }

        return p;
    }
}