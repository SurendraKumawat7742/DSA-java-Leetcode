class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
    //Adjacency List
        // List<Integer>[] graph = new ArrayList[n];
        // Map<List<Integer>, Integer> cntFreq = new HashMap<>();

        // for(int vertex=0; vertex<n; vertex++){
        //     graph[vertex] = new ArrayList<>();
        //     graph[vertex].add(vertex);
        // }
        // for(int[] edge : edges){
        //     graph[edge[0]].add(edge[1]);
        //     graph[edge[1]].add(edge[0]);
        // }
        // for(int vertex=0; vertex<n; vertex++){
        //     List<Integer> neighbors = graph[vertex];
        //     Collections.sort(neighbors);
        //     cntFreq.put(neighbors,
        //         cntFreq.getOrDefault(neighbors, 0)+1);
        // }

        // int cntComplete = 0;
        // for(Map.Entry<List<Integer>, Integer> entry : cntFreq.entrySet()){
        //     if(entry.getKey().size() == entry.getValue()){
        //         cntComplete++;
        //     }
        // }

        // return cntComplete;


    //DFS
        List<Integer>[] adjList = new ArrayList[n];
        for(int vertex=0; vertex<n; vertex++){
            adjList[vertex] = new ArrayList<>();
        }
        for(int[] edge : edges){
            adjList[edge[0]].add(edge[1]);
            adjList[edge[1]].add(edge[0]);
        }

        int cnt = 0;
        boolean[] visited = new boolean[n];
        for(int i=0; i<n; i++){
            if(visited[i] == true) continue;
            int[] comInfo = new int[2];
            dfs(adjList, visited, i, comInfo);
            if(comInfo[0]*(comInfo[0]-1) == comInfo[1]) cnt++;
        }
        return cnt;
    }
    public void dfs(List<Integer>[] adjList, boolean[] visited, int ind, int[] comInfo){
        visited[ind] = true;
        comInfo[0]++;
        comInfo[1] += adjList[ind].size();

        for(int i=0; i<adjList[ind].size(); i++){
            int node = adjList[ind].get(i);
            if(visited[node] == false){
                dfs(adjList, visited, node, comInfo);
            }
        }
    }
}