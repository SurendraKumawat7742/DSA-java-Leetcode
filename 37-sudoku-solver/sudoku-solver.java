class Solution {
    public boolean isSafe(char[][] board,int row,int col,int digit){
        //column
        for(int i=0;i<=8;i++){
            if(board[i][col] == digit){
                return false;
            }
        }
        //row
        for(int j=0;j<=8;j++){
            if(board[row][j] == digit){
                return false;
            }
        }
        //grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        //3*3 grid
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean sudokuSolver(char[][] board,int row,int col){
        if(row==9){
            return true;
        }
        int nextRow = row;
        int nextCol = col+1;
        if(col+1 == 9){
            nextRow = row+1;
            nextCol = 0;
        }
        if(board[row][col]!='.'){
            return sudokuSolver(board,nextRow,nextCol);
        }
        for(char i='1';i<='9';i++){
            if(isSafe(board,row,col,i)){
                board[row][col] = i;
                if(sudokuSolver(board,nextRow,nextCol)){
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        sudokuSolver(board,0,0);
}
}