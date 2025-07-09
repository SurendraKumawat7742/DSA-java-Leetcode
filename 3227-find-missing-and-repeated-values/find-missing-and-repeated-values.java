class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        // Set<Integer> set = new HashSet<>();
        // int n = grid.length;
        // int m = grid[0].length;
        // int[] res = new int[2];
        // int sum = 0;
        // int total = (n*m)*((n*m)+1)/2;
        // int repeat = 0;
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         if(!set.contains(grid[i][j])){
        //             set.add(grid[i][j]);
        //             sum += grid[i][j];
        //         }else{
        //             repeat = grid[i][j];
        //         }
        //     }
        // }
        // res[1] = total-sum;
        // res[0] = repeat;
        // return res;


    //2nd
        int n = grid.length;
        int size = n * n;
        int[] count = new int[size + 1]; // index 1 to n^2

        // Count frequency of each number in the grid
        for (int[] row : grid) {
            for (int num : row) {
                count[num]++;
            }
        }

        int repeated = -1, missing = -1;

        // Find the repeated and missing numbers
        for (int i = 1; i <= size; i++) {
            if (count[i] == 2) {
                repeated = i;
            } else if (count[i] == 0) {
                missing = i;
            }
        }

        return new int[]{repeated, missing};
    }
}