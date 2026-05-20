class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Map<Integer, Integer> mp = new HashMap<>();
        int n = A.length;
        int[] res = new int[n];
        for(int i=0; i<n; i++){
            mp.put(B[i], 0);
        }

        for(int i=0; i<n; i++){
            mp.put(A[i], mp.getOrDefault(A[i], 0)+1);
            int cnt = 0;
            for(int j=0; j<=i; j++){
                cnt += mp.get(B[j]);
            }
            res[i] = cnt;
        }

        return res;
    }
}