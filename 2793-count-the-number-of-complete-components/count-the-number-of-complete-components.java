class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<Integer>[] graph = new ArrayList[n];
        Map<List<Integer>, Integer> cntFreq = new HashMap<>();

        for(int vertex=0; vertex<n; vertex++){
            graph[vertex] = new ArrayList<>();
            graph[vertex].add(vertex);
        }
        for(int[] edge : edges){
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        for(int vertex=0; vertex<n; vertex++){
            List<Integer> neighbors = graph[vertex];
            Collections.sort(neighbors);
            cntFreq.put(neighbors,
                cntFreq.getOrDefault(neighbors, 0)+1);
        }

        int cntComplete = 0;
        for(Map.Entry<List<Integer>, Integer> entry : cntFreq.entrySet()){
            if(entry.getKey().size() == entry.getValue()){
                cntComplete++;
            }
        }

        return cntComplete;
    }
}