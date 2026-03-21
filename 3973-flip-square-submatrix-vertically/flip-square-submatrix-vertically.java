class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int i = x;
        for(int row=x+k-1; row>=x; row--){
            int j = y;
            if(row <= i){
                break;
            }
            for(int col=y; col<y+k; col++){
                int temp = grid[i][j];
                grid[i][j] = grid[row][col];
                grid[row][col] = temp;

                j++;
            }
            i++;
        }
        return grid;
    }
}