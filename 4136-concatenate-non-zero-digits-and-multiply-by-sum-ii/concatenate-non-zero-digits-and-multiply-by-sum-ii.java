// import java.math.BigInteger;

// class Solution {
//     static final BigInteger MOD = BigInteger.valueOf(1000000007L);
//     public int[] sumAndMultiply(String s, int[][] queries) {
//         int n = queries.length;
//         int[] res = new int[n];

//         int i = 0, j=0;
//         while(i < n){
//             int left = queries[i][0], right = queries[i][1];
//             String st = s.substring(left, Math.min(right+1,s.length()));
//             String nonZero = st.replace("0","");
//             if(nonZero.isEmpty()){
//                 nonZero = "0";
//             }
//             BigInteger x = new BigInteger(nonZero);

//             int sum = 0;
//             for(char c : nonZero.toCharArray()){
//                 sum += c-'0';
//             }
//             BigInteger result = x.mod(MOD).multiply(BigInteger.valueOf(sum)).mod(MOD);
            
//             res[j] = result.intValue();
//             i++;
//             j++;
//         }
//         return res;
//     }
    
// }



class Solution {
    static final int MOD = 1000000007;

    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length(), m = queries.length;
        long[] preSum = new long[n];
        long[] preNonZero = new long[n];
        long[] preCnt = new long[n];

        for(int i=0; i<n; i++){
            int digit = s.charAt(i) - '0';

            if(i > 0){
                preSum[i] = preSum[i-1];
                preNonZero[i] = preNonZero[i-1];
                preCnt[i] = preCnt[i-1];
            }
            if(digit != 0){
                preSum[i] += digit;
                preCnt[i]++;
                preNonZero[i] = ((preNonZero[i]*10)%MOD + digit)%MOD;
            }
        }

        int[] res = new int[m];
        long[] pow = new long[n+1];
        pow[0] = 1;
        for(int i=1; i<=n; i++){
            pow[i] = (pow[i-1]*10)%MOD;
        }
        for(int i=0; i<m; i++){
            int l = queries[i][0], r = queries[i][1];
            long len = preCnt[r] - (l>0 ? preCnt[l-1] : 0);
            long x = preNonZero[r];
            if(l > 0){
                x = (x-(preNonZero[l-1]*pow[(int)len]%MOD)+MOD)%MOD;
            }

            long sum = (preSum[r] - (l > 0 ? preSum[l-1] : 0))%MOD;
            res[i] = (int)((x*sum)%MOD)%MOD;
        }
        return res;
    }
}