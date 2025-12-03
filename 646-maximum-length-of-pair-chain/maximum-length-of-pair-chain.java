class Solution {
    public int findLongestChain(int[][] pairs) {
//1st
        // int n = pairs.length;
        // Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));
        // int ans = 1;
        // int lastEnd = pairs[0][1];
        // for(int i=1; i<n; i++){
        //     if(pairs[i][0] > lastEnd){
        //         ans++;
        //         lastEnd = pairs[i][1];
        //     }
        // }
        // return ans;

//2nd
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));
        int curr = Integer.MIN_VALUE, res = 0;
        for (int[] p : pairs) {
            if (curr < p[0]) {
                curr = p[1];
                res++;
            }
        }
        return res;
    }
}