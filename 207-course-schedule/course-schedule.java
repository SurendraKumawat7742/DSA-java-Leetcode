class Solution {
    public boolean canFinish(int n, int[][] pre) {
//1st
    //     ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    //    int inDeg[] = new int[n];
    //    for(int i=0;i<n;i++){
    //         //adj[0] = []
    //         //adj[1] = []
    //         adj.add(new ArrayList<>());
    //    } 
    //    for(int i=0;i<pre.length;i++){
    //     int a = pre[i][0];
    //     int b = pre[i][1];
    //     //b -> a
    //     adj.get(b).add(a);
    //     inDeg[a]++;
    //    }
    //    Queue<Integer> q = new LinkedList<>();
    //    for(int i=0;i<n;i++){
    //         if(inDeg[i]==0){
    //             q.add(i);
    //         }
    //    }
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     while(!q.isEmpty()){
    //         int curr = q.remove();
    //         ans.add(curr);
    //         for(int conn : adj.get(curr)){
    //             inDeg[conn]--;
    //             if(inDeg[conn]==0){
    //                 q.add(conn);
    //             }
    //         }
    //     }
    //     if(ans.size()==n){//all courses are in ans
    //         return true;//its possible to do all courses
    //     }else{
    //         return false;
    //     }


//2nd
        List<Integer>[] adj = new ArrayList[n];
        int[] degree = new int[n];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            adj[i] = new ArrayList<Integer>();
        }
        for(int[] x : pre){
            adj[x[1]].add(x[0]);
            degree[x[0]]++;
        }
        for(int i=0; i<n; i++){
            if(degree[i] == 0){
                q.add(i);
            }
        }
        int count = 0;
        while(!q.isEmpty()){
            int c = q.poll();
            count++;
            for(int j : adj[c]){
                if(--degree[j] == 0){
                    q.add(j);
                }
            }
        }
        return count == n;
    }
}