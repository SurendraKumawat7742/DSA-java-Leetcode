class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;

        int rows = matrix.length, cols = matrix[0].length;
        int[] height = new int[cols];
        int[] left = new int[cols];
        int[] right = new int[cols];

        for (int j = 0; j < cols; j++) right[j] = cols;

        int maxArea = 0;

        for (int i = 0; i < rows; i++) {

            int curLeft = 0, curRight = cols;

            // update height
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '1') height[j]++;
                else height[j] = 0;
            }

            // update left
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '1')
                    left[j] = Math.max(left[j], curLeft);
                else {
                    left[j] = 0;
                    curLeft = j + 1;
                }
            }

            // update right
            for (int j = cols - 1; j >= 0; j--) {
                if (matrix[i][j] == '1')
                    right[j] = Math.min(right[j], curRight);
                else {
                    right[j] = cols;
                    curRight = j;
                }
            }

            // compute area
            for (int j = 0; j < cols; j++) {
                maxArea = Math.max(maxArea, (right[j] - left[j]) * height[j]);
            }
        }

        return maxArea;
    }
}