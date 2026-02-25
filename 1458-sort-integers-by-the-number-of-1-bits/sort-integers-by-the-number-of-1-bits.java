class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Arrays.sort(arr);
        int[][] A = new int[n][2];
        for(int i=0; i<n; i++){
            A[i][0] = arr[i];
            int cnt = Integer.bitCount(arr[i]);
            A[i][1] = cnt;
        }
        Arrays.sort(A, (a,b) -> Integer.compare(a[1], b[1]));
        for(int i=0; i<n; i++){
            ans[i] = A[i][0];
        }
        return ans;
    }
}