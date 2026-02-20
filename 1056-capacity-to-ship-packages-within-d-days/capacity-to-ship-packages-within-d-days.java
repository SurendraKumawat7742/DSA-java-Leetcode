class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int left = Arrays.stream(weights).max().getAsInt();
        int right = Arrays.stream(weights).sum();

        while(left < right){
            int mid = (left+right)/2;
            int need = 1, curr = 0;
            for(int i=0; i<n; i++){
                if(curr+weights[i] > mid){
                    curr = 0;
                    need++;
                }

                curr += weights[i];
            }
            if(need > days){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}