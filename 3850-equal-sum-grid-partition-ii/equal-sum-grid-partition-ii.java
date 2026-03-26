class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        long total = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                total += grid[i][j];
            }
        }

        for(int k=0; k<4; k++){
            Set<Long> set = new HashSet<>();
            set.add(0L);
            long sum = 0;
            n = grid.length;
            m = grid[0].length;
            if(n < 2){
                grid = rotation(grid);
                continue;
            }
            if(m == 1){
                for(int i=0; i<n-1; i++){
                    sum += grid[i][0];
                    long tag = 2*sum - total;
                    if(tag == 0 || tag == grid[0][0] || tag == grid[i][0]){
                        return true;
                    }
                }
                grid = rotation(grid);
                    continue;
            }

            for(int i=0; i<n-1; i++){
                for(int j=0; j<m; j++){
                    set.add((long)grid[i][j]);
                    sum += grid[i][j];
                }
                long tag = 2*sum - total;
                if(i == 0){
                    if(tag == 0 || tag == grid[0][0] || tag == grid[0][m-1]){
                        return true;
                    }
                    continue;
                }
                if(set.contains(tag)){
                    return true;
                }
            }
            grid = rotation(grid);
        }
        return false;
    }
    public int[][] rotation(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        int[][] temp = new int[m][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                temp[j][n-1-i] = grid[i][j];
            }
        }
        return temp;
    }
}