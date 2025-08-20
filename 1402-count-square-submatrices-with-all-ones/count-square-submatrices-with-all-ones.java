class Solution {
    public int countSquares(int[][] matrix) {
//1st
        // int row = matrix.length;
        // int col = matrix[0].length;
        // int dp[][] = new int[row+1][col+1];
        // int ans = 0;
        // for(int i=0; i<row; i++){
        //     for(int j=0; j<col; j++){
        //         if(matrix[i][j] == 1){
        //             dp[i+1][j+1] = Math.min(
        //                     Math.min(dp[i][j+1], dp[i+1][j]),dp[i][j]
        //             )+1;
        //             ans += dp[i+1][j+1];
        //         }
        //     }
        // }
        // return ans;

//2nd
        int m = matrix.length, n = matrix[0].length;
        int count =0;
        for (int i=1;i<m;i++) {
            for (int j=1;j<n;j++) {
                if (matrix[i][j] == 1) {
                    matrix[i][j] += Math.min(matrix[i-1][j], Math.min(matrix[i][j-1], matrix[i-1][j-1]));
                    count += matrix[i][j];
                }
            }
        }
        for (int i=0;i<m;i++) {
            count+=matrix[i][0];
        }

        for (int i=1;i<n;i++) {
            count+=matrix[0][i];
        }
        return count;
    }
}