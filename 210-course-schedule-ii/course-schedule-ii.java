class Solution {
    public int[] findOrder(int n, int[][] pre) {
//1st
    //      ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
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
    //     int k = 0;
    //     int ans[] = new int[n];
    //     while(!q.isEmpty()){
    //         int curr = q.remove();
    //         ans[k] = curr;
    //         k++;
    //         for(int conn : adj.get(curr)){
    //             inDeg[conn]--;
    //             if(inDeg[conn]==0){
    //                 q.add(conn);
    //             }
    //         }
    //     }
    //     if(k==n){//all courses are in ans
    //         return ans;//its possible to do all courses
    //     }else{
    //         return new int[0];
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
        int[] ans = new int[n];
        while(!q.isEmpty()){
            int c = q.poll();
            ans[count] = c;
            count++;
            for(int j : adj[c]){
                if(--degree[j] == 0){
                    q.add(j);
                }
            }
        }
        if(count == n){
            return ans;
        }else{
            return new int[0];
        }
    }
}