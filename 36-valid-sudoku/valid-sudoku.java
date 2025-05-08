class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] row = new HashSet[9];
        Set<Character>[] col = new HashSet[9];
        Set<Character>[] box = new HashSet[9];

        for(int i=0; i<9; i++){
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }

        for(int r=0; r<9; r++){
            for(int c=0; c<9; c++){
                if(board[r][c] == '.'){
                    continue;
                }
                char value = board[r][c];
                int boxIdx = (r/3)*3 + (c/3);
                if(row[r].contains(value) || col[c].contains(value) || box[boxIdx].contains(value)){
                    return false;
                }
                row[r].add(value);
                col[c].add(value);
                box[boxIdx].add(value);
            }
        }
        return true;
    }
}