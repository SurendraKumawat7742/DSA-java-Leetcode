class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
    //1st
        // Arrays.sort(arr);
        // int ans = 1;
        // for(int i=1; i<arr.length; i++){
        //     if(arr[i] >= ans+1){
        //         ans++;
        //     }
        // }
        // return ans;

    //2nd
        int n = arr.length;
        int[] cnt = new int[n+1];
        int ans = 1;
        for(int i=0; i<n; i++){
            cnt[Math.min(n, arr[i])]++;
        }

        for(int i=2; i<cnt.length; i++){
            ans = Math.min(i, ans+cnt[i]);
        }

        return ans;
    }
}