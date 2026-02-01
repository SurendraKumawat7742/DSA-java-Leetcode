class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n*n;
        int[] cnt = new int[size+1];
        for(int[] num : grid){
            for(int x : num){
                cnt[x]++;
            }
        }
        int repeat = -1;
        int missing = -1;
        for(int i=1; i<=size; i++){
            if(cnt[i] == 2){
                repeat = i;
            }
            else if(cnt[i] == 0){
                missing = i;
            }
        }
        return new int[]{repeat, missing};
    }
}