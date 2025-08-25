class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
//1st
        // if (matrix == null || matrix.length == 0) {
        //     return new int[0];
        // }
        // int N = matrix.length;
        // int M = matrix[0].length;
        
        // int row = 0, column = 0;
        // int direction = 1;
        
        // int[] result = new int[N*M];
        // int r = 0;
        // while (row < N && column < M) {
        //     result[r++] = matrix[row][column];
        //     int new_row = row + (direction == 1 ? -1 : 1);
        //     int new_column = column + (direction == 1 ? 1 : -1);
        //     if (new_row < 0 || new_row == N || new_column < 0 || new_column == M) {
        //         if (direction == 1) {
        //             row += (column == M - 1 ? 1 : 0) ;
        //             column += (column < M - 1 ? 1 : 0);
        //         } else {
        //             column += (row == N - 1 ? 1 : 0);
        //             row += (row < N - 1 ? 1 : 0);
        //         }
        //         direction = 1 - direction;
        //     } else {
        //         row = new_row;
        //         column = new_column;
        //     }
        // }
        // return result;  

//2nd
        // int n = matrix.length;
        // int m = matrix[0].length;
        // if(n == 0 || m == 0){
        //     return new int[0];
        // }
        // int row = 0;
        // int col = 0;
        // int index = 0;
        // int[] arr = new int[n*m];
        // boolean up = true;
        // while(index < n*m){
        //     arr[index++] = matrix[row][col];
        //     if(up){
        //         if(col == m-1){
        //             row++;
        //             up = false;
        //         }else if(row == 0){
        //             col++;
        //             up = false;
        //         }else{
        //             row--;
        //             col++;
        //         }
        //     }else{
        //         if(row == n-1){
        //             col++;
        //             up = true;
        //         }else if(col == 0){
        //             row++;
        //             up = true;
        //         }else{
        //             row++;
        //             col--;
        //         }
        //     }
        // }
        // return arr;

//3rd
        int n = matrix.length;
        int m = matrix[0].length;
        List<List<Integer>> a = new ArrayList<>();
        int flag = 0;
        for(int i=0; i<n; i++){
            List<Integer> temp = new ArrayList<>();
            int j=i, k=0;
            while(j >= 0 && k < m){
                temp.add(matrix[j][k]);
                j--;
                k++;
            }
            if(flag%2 == 0){
                a.add(temp);
            }else{
                Collections.reverse(temp);
                a.add(temp);
            }
            flag++;
        }
        for(int i=1; i<m; i++){
            List<Integer> temp = new ArrayList<>();
            int j=n-1, k=i;
            while(j >= 0 && k < m){
                temp.add(matrix[j][k]);
                j--;
                k++;
            }
            if(flag%2 == 0){
                a.add(temp);
            }else{
                Collections.reverse(temp);
                a.add(temp);
            }
            flag++;
        }
        int[] arr = new int[n*m];
        int idx = 0;
        for(List<Integer> b : a){
            for(int val : b){
                arr[idx++] = val;
            }
        }
        return arr;
    }
}