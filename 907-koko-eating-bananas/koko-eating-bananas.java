class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        while(left < right){
            int mid = left + (right-left)/2;
            int hour = calculation(piles,mid);
            if(hour <= h){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
    private int calculation(int[] piles , int k){
        int hours = 0;
        for(int pile : piles){
            hours += (pile+k-1)/k;
        }
        return hours;
    }
}