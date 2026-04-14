class Solution {
    public int kthSmallest(int[][] mat, int k) {
    //1st
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // int n = mat.length;
        // int m = mat[0].length;

        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         pq.add(mat[i][j]);
        //     }
        // }
        // for(int i=0; i<k-1; i++){
        //     pq.poll();
        // }
        // return pq.poll();

    //2nd
        int n = mat.length;
        int m = mat[0].length;
        int low = mat[0][0];
        int high = mat[n-1][m-1];
        while(low < high){
            int mid = low+(high-low)/2;
            if(count(mat, mid) < k){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        return low;
    }
    public int count(int[][] mat, int mid){
        int i = mat.length-1;
        int j = 0;
        int cnt = 0;
        while(i>=0 && j<mat.length){
            if(mat[i][j] <= mid){
                cnt += (i+1);
                j++;
            }else{
                i--;
            }
        }
        return cnt;
    }

}