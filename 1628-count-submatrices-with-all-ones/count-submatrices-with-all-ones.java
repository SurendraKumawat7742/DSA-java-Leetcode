class Solution {
    public int numSubmat(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int res = 0;
        for(int stRow=0; stRow<m; stRow++){
            int[] arr = new int[n];
            Arrays.fill(arr, 1);
            for(int endRow=stRow; endRow<m; endRow++){
                for(int col=0; col<n; col++){
                    arr[col] = arr[col] & matrix[endRow][col];
                }
                res += oneDArrayCnt(arr);
            }
        }
        return res;
    }
    public int oneDArrayCnt(int[] arr){
        int cons=0, subCons=0;
        for(int val : arr){
            if(val == 0){
                cons = 0;
            }else{
                cons++;
            }
            subCons += cons;
        }
        return subCons;
    }
}