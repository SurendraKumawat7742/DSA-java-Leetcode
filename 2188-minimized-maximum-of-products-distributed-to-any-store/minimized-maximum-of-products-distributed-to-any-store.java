class Solution {
    public boolean pri(int[] nums,int n,int value){
        if(n<nums.length) return false;
        for(int i=0;i<nums.length;i++){
            int x = nums[i];
            // while(x>0){
            //     x-=value;
            //     n--;
            // }
            int temp = x/value;
            if(x%value != 0) temp++;
            n-=temp;
            if(n<0) return false;
        }
        return true;
    } 
    public int minimizedMaximum(int n, int[] quantities) {
        int l = 1;
        // int r = Integer.MAX_VALUE;
        int r = (int)Math.pow(10,5);
        while(l<=r){
            int mid = l+(r-l)/2;
            if(pri(quantities,n,mid)){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return l;
    }
}