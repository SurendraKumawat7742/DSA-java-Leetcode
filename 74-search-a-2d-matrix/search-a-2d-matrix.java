class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int r=0;r<matrix.length;r++){
            int left = 0, right = matrix[0].length-1;
            while(left<=right){
                int mid = (left+right)/2;//column
                if(matrix[r][mid]==target){
                    return true;
                }else if(matrix[r][mid]<target){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        return false;

    }
}