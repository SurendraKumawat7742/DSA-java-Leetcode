class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] ans = new int[n-k+1][m-k+1];
        if(k==1){
            return ans;
        }
        for(int i=0; i<=n-k; i++){
            for(int j=0; j<=m-k; j++){
                List<Integer> list = new ArrayList<>();
                for(int x=i; x<i+k; x++){
                    for(int y=j; y<j+k; y++){
                        if(!list.contains(grid[x][y])){
                            list.add(grid[x][y]);
                        }
                    }
                }
                Collections.sort(list);
                int minDiff = Integer.MAX_VALUE;
                
                for(int z=1; z<list.size(); z++){
                   minDiff = Math.min(minDiff, Math.abs(list.get(z) - list.get(z-1)));
                }
                if(minDiff == Integer.MAX_VALUE){
                    minDiff = 0;
                }
                ans[i][j] = minDiff;
            }
        }
        return ans;
    }
}