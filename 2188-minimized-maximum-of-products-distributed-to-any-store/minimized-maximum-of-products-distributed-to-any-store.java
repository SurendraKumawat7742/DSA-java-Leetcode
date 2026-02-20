class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int m = quantities.length;
        int low = 1;
        int high = 0;
        for(int i=0; i<m; i++){
            high = Math.max(high, quantities[i]);
        }

        int res = 0;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(isPossible(n, quantities, mid)){
                res = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return res;
    }

    public boolean isPossible(int n, int[] quantities, int ans){
        int cnt = 0;
        for(int i=0; i<quantities.length; i++){
            cnt += (quantities[i]+ans-1)/ans;
        }

        return cnt <= n;
    }
}