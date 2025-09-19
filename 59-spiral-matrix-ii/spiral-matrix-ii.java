class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int sr=0, sc=0, er=n-1, ec=n-1;
        int row, col;
        int st = 1;
        while(sr<=er && sc<=ec){
            row = sr;
            for(col=sc;col<=ec && sr<=er ;col++){
                arr[row][col] = st;
                st++;
            }
            sr++;
            col = ec;
            for(row=sr;row<=er&& sc<=ec;row++){
                arr[row][col] = st;
                st++;
            }
            ec--;
            row = er;
            for(col=ec;col>=sc&& sr<=er ;col--){
                arr[row][col] = st;
                st++;
            }
            er--;
            col = sc;
            for(row=er;row>=sr && sc<=ec;row--){
                arr[row][col] = st;
                st++;
            }
            sc++;
        }
        return arr;
    }
}