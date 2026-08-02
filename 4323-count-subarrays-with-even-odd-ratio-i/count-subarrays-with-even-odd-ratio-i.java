class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int n = nums.length;
        int res = 0;
        int x =0 , y = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(nums[j]%2 == 0){
                    x++;
                }else{
                    y++;
                }
                if(y > 0 && (x*b) <= (a*y)){
                    res++;
                }
            }
            x = y =0;
        }
        return res;
    }
}