class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        int m = languages.length;

        Set<Integer>[] know = new HashSet[m+1];

        for(int i=1; i<=m; i++){
            know[i] = new HashSet<>();
            for(int lang : languages[i-1]){
                know[i].add(lang);
            }
        }

        Set<Integer> candidates = new HashSet<>();
        for(int[] f : friendships){
            int u = f[0], v = f[1];
            boolean canComm = false;
            for(int l : know[u]){
                if(know[v].contains(l)){
                    canComm = true;
                }
            }
            if(!canComm){
                candidates.add(u);
                candidates.add(v);
            }
        }

        int best = 0;
        for(int l = 1; l<=n; l++){
            int cnt = 0;
            for(int u : candidates){
                if(know[u].contains(l)){
                    cnt++;
                }
            }
            best = Math.max(best, cnt);
        }
        return candidates.size()-best;
    }
}