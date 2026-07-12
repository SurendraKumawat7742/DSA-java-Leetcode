class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        if(n == 0){
            return new int[]{};
        }
        int[][] a = new int[n][2];
        for(int i=0; i<n; i++){
            a[i][0] = arr[i];
            a[i][1] = i;
        }
        Arrays.sort(arr);
        Arrays.sort(a, (c,d) -> Integer.compare(c[0], d[0]));

        int[] ans = new int[n];
        a[0][0] = 1;
        for(int i=1; i<n; i++){
            if(arr[i] != arr[i-1]){
                a[i][0] = a[i-1][0]+1;
            }else{
                a[i][0] = a[i-1][0];
            }
        }
        Arrays.sort(a, (c,d) -> Integer.compare(c[1], d[1]));
        for(int i=0; i<n; i++){
            ans[i] = a[i][0];
        }
        return ans;
    }
}