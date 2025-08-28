class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                int k = i, m = j;
                if(i<j){
                    while(k >= 1 && m >= 1){
                        if(grid[k-1][m-1]>grid[k][m]){
                            int temp = grid[k-1][m-1];
                            grid[k-1][m-1] = grid[k][m];
                            grid[k][m] = temp;
                        }
                        k--;
                        m--;
                    }
                }else{
                    k = i;
                    m = j;
                    while(k >= 1 && m >= 1){
                        if(grid[k-1][m-1]<grid[k][m]){
                            int temp = grid[k-1][m-1];
                            grid[k-1][m-1] = grid[k][m];
                            grid[k][m] = temp;
                        }
                        k--;
                        m--;
                    }
                }
            }
        }
        return grid;
    }
}