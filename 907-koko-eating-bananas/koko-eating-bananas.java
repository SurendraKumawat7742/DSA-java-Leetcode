class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int num : piles){
            max = Math.max(max, num);
        }
        int low = 1, high = max;
        while(low < high){
            int mid = low+(high-low)/2;
            if(isPoss(piles, mid, h)){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    public boolean isPoss(int[] piles, int mid, int h){
        int cnt = 0;
        for(int num : piles){
            cnt += (num+mid-1)/mid;
        }
        return cnt <= h;
    }
}