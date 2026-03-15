class Solution {
    public int numSpecial(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int res = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(mat[i][j] == 0){
                    continue;
                }
                boolean isTrue = true;
                for (int r = 0; r < n; r++) {
                    if (r != i && mat[r][j] == 1) {
                        isTrue = false;
                        break;
                    }
                }
                
                for (int c = 0; c < m; c++) {
                    if (c != j && mat[i][c] == 1) {
                        isTrue = false;
                        break;
                    }
                }
                
                if (isTrue) {
                    res++;
                }
            }
        }
        return res;
    }
}