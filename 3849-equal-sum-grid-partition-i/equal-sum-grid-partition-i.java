class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        long sum = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                sum += grid[i][j];
            }
        }

        long cntRowSum = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                cntRowSum += grid[i][j];
            }
            if(cntRowSum == (sum-cntRowSum)){
                return true;
            }
        }

        long cntColSum = 0;
        for(int j=0; j<m; j++){
            for(int i=0; i<n; i++){
                cntColSum += grid[i][j];
            }
            if(cntColSum == (sum-cntColSum)){
                return true;
            }
        }

        return false;
    }
}