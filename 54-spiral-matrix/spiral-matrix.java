class Solution {//O(N*M)
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> ans = new ArrayList<>();
        int n = mat.length;
        int m = mat[0].length;
        int sr = 0,sc = 0,er = n-1,ec = m-1;
        int row , col;
        while(sr<=er && sc<=ec){
            row = sr;
            for(col=sc;col<=ec && sr<=er ;col++){
                ans.add(mat[row][col]);
            }
            sr++;
            col = ec;
            for(row=sr;row<=er&& sc<=ec;row++){
                ans.add(mat[row][col]);
            }
            ec--;
            row = er;
            for(col=ec;col>=sc&& sr<=er ;col--){
                ans.add(mat[row][col]);
            }
            er--;
            col = sc;
            for(row=er;row>=sr && sc<=ec;row--){
                ans.add(mat[row][col]);
            }
            sc++;
        }
        return ans;
    }
}