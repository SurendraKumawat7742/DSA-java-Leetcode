class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
    //1st
        // Map<Integer, Integer> mp = new HashMap<>();
        // int n = A.length;
        // int[] res = new int[n];
        // for(int i=0; i<n; i++){
        //     mp.put(B[i], 0);
        // }

        // for(int i=0; i<n; i++){
        //     mp.put(A[i], mp.getOrDefault(A[i], 0)+1);
        //     int cnt = 0;
        //     for(int j=0; j<=i; j++){
        //         cnt += mp.get(B[j]);
        //     }
        //     res[i] = cnt;
        // }

        // return res;


    //2nd
        int[] ans = new int[A.length];
        int[] freq = new int[A.length + 1];
        int common = 0;
        for(int i = 0; i < A.length; i++){
            freq[A[i]]++;
            if(freq[A[i]] == 2){
                common++;
            }
            freq[B[i]]++;
            if(freq[B[i]] == 2){
                common++;
            }
            ans[i] = common;
        }
        return ans;
    }
}