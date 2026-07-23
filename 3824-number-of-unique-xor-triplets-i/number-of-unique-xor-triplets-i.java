class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        if(n <= 2){
            return n;
        }
    //Brute force
        // int cnt = 0;
        // Set<Integer> set = new HashSet<>();
        // for(int i=0; i<n-2; i++){
        //     for(int j=i; j<n-1; j++){
        //         for(int k=j; k<n; k++){
        //             int xor = nums[i]^nums[j]^nums[k];
        //             if(!set.contains(xor)){
        //                 cnt++;
        //                 set.add(xor);
        //             }
        //         }
        //     }
        // }
        // return cnt;


    //Optimized
    //1st
        // int pow = 0;
        // while(Math.pow(2,pow) < n){
        //     pow++;
        // }
        // if(Math.pow(2,pow) > n){
        //     pow--;
        // }

        // return (int)Math.pow(2,pow+1);

    //2nd
        int ans = 1;
        while(ans <= n){
            ans <<= 1;
        }
        return ans;
    }
}