class Solution {
    public int mySqrt(int x) {
    //1st
        // return (int)Math.pow(x, 0.5);  //don't use

    //2nd
        if(x==0){
            return 0;
        }
        long low = 1;
        long high = x;
        long ans = 1;
        while(low <= high){
            long mid = low+(high-low)/2;
            long square = mid*mid;
            if(square == x){
                return (int)mid;
            }else if(square < x){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return (int)ans;
    }
}