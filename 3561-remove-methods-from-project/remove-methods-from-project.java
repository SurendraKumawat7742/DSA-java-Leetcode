class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<Integer>[] edges = new ArrayList[n];
        for(int i=0; i<n; i++){
            edges[i] = new ArrayList<>();
        }
        int[] cnt = new int[n];
        for(int[] invo : invocations){
            edges[invo[0]].add(invo[1]);
            cnt[invo[1]]++;
        }

        boolean[] susp = new boolean[n];
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(k);
        susp[k] = true;
        while(!q.isEmpty()){
            int u = q.poll();
            for(int v : edges[u]){
                cnt[v]--;
                if(!susp[v]){
                    susp[v] = true;
                    q.offer(v);
                }
            }
        }
        boolean canRemAll = true;
        List<Integer> rem = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(susp[i] && cnt[i] > 0){
                canRemAll = false;
                break;
            }else if(!susp[i]){
                rem.add(i);
            }
        }
        if(!canRemAll){
            List<Integer> res = new ArrayList<>();
            for(int i=0; i<n; i++){
                res.add(i);
            }
            return res;
        }
        return rem;
    }
}