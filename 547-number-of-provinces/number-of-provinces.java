class Solution {
    public void dfs(int i, int[][] isCon, boolean[] vis){
        vis[i] = true;
        for(int j=0; j<isCon.length; j++){
            if(isCon[i][j] == 1 && !vis[j]){
                dfs(j, isCon, vis);
            }
        }
    }
    public int findCircleNum(int[][] isCon) {
        int n = isCon.length;
        boolean[] vis = new boolean[n];
        int cnt = 0;
        for(int i=0; i<n; i++){
            if(!vis[i]){
                cnt++;
                dfs(i, isCon, vis);
            }
        }
        return cnt;
    }
}