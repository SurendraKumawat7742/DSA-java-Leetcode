class Solution {
    public int findLongestChain(int[][] pairs) {
        int n = pairs.length;
        Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));
        int ans = 1;
        int lastEnd = pairs[0][1];
        for(int i=1; i<n; i++){
            if(pairs[i][0] > lastEnd){
                ans++;
                lastEnd = pairs[i][1];
            }
        }
        return ans;
    }
}