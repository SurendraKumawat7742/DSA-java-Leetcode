class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < (long)m*k){
            return -1;
        }
        int min = Arrays.stream(bloomDay).min().getAsInt();
        int max = Arrays.stream(bloomDay).max().getAsInt();
        int low = min , high = max;
        while(low < high){
            int mid = (low+high)/2;
            if(possible(bloomDay, mid, m, k)){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    private boolean possible(int[] bloomDay, int day, int m, int k){
        int n = bloomDay.length;
        int count = 0 , bouq = 0;
        for(int i=0; i<n; i++){
            if(bloomDay[i] <= day){
                count++;
            }else{
                bouq += (count/k);
                count = 0;
            }
        }
        bouq += count/k;
        return bouq >= m;
        
    }
}