class Solution {
    private Set<String> vis;
    public boolean dfs(char[][] board, int i, int j, String word, int k){
        int n = board.length;
        int m = board[0].length;
        if(k == word.length()){
            return true;
        }
        if(i<0 || i>=n || j<0 || j>=m || vis.contains(i+","+j) || board[i][j] != word.charAt(k)){
            return false;
        }
        vis.add(i+","+j);
        boolean res = dfs(board, i+1, j, word, k+1)||dfs(board, i-1, j, word, k+1)||dfs(board, i, j+1, word, k+1)||dfs(board, i, j-1, word, k+1);

        vis.remove(i+","+j);
        return res;
    }
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        vis = new HashSet<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(dfs(board, i, j, word, 0)){
                    return true;
                }
            }
        }
        return false;
    }
}