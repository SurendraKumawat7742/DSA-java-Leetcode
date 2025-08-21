class Solution {

//1st
    // public int numSubmat(int[][] matrix) {
    //     int m = matrix.length, n = matrix[0].length;
    //     int res = 0;
    //     for(int stRow=0; stRow<m; stRow++){
    //         int[] arr = new int[n];
    //         Arrays.fill(arr, 1);
    //         for(int endRow=stRow; endRow<m; endRow++){
    //             for(int col=0; col<n; col++){
    //                 arr[col] = arr[col] & matrix[endRow][col];
    //             }
    //             res += oneDArrayCnt(arr);
    //         }
    //     }
    //     return res;
    // }
    // public int oneDArrayCnt(int[] arr){
    //     int cons=0, subCons=0;
    //     for(int val : arr){
    //         if(val == 0){
    //             cons = 0;
    //         }else{
    //             cons++;
    //         }
    //         subCons += cons;
    //     }
    //     return subCons;
    // }


//2nd
    public int numSubmat(int[][] mat) {

        int count = 0;
        int[][] height = new int[mat.length][mat[0].length];
        for(int i = 0;i<mat[0].length;i++){
            height[0][i] = mat[0][i];
        }

        for(int i = 1;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                if(mat[i][j] == 1){
                    height[i][j] = 1 + height[i-1][j];
                }
                
            }
        }
       for(int i=0;i<height.length;i++){
        count += fcount(height[i]);
       }
       return count;

    }
    int fcount(int[] row){
         int col = row.length;
         int ans = 0;
         for(int i = 0;i<col;i++){
            if(row[i]!=0){
            int minh = row[i];
            for(int j = i;j>=0;j--){
              minh = Math.min(minh,row[j]);
              if(minh == 0){
                break;
              }
              ans+= minh;
            }
            }    
         }
         return ans;
    }
}