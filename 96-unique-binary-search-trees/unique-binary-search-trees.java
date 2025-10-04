class Solution {
    public int numTrees(int n) {
        int[] unique = new int[n+1];
        for(int i=0; i<=n; i++){
            unique[i] = 1;
        }
        for(int node=2; node<=n; node++){
            int total = 0;
            for(int root=1; root<=node; root++){
                total += unique[root-1]*unique[node-root];
            }
            unique[node] = total;
        }
        return unique[n];
    }
}