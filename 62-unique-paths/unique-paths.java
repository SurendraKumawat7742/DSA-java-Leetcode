class Solution {
    public int solver(int i, int j, int m, int n, int[][] memo){
        if(i >= m || j >= n) return 0;
        if(i == m-1 && j == n-1) return 1;
        if(memo[i][j] != -1){
            return memo[i][j];
        }else{
            return memo[i][j] = solver(i+1, j, m, n, memo)+
                                solver(i, j+1, m, n, memo);
        }
    }
    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                memo[i][j] = -1;
            }
        }
        return solver(0, 0, m, n, memo);
    }
}