class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> mp = new HashMap<>();
        for(String s : words){
            mp.put(s, mp.getOrDefault(s,0)+1);
        }

        PriorityQueue<Map.Entry<String,Integer>> maxHeap = new PriorityQueue<>(
            (a,b) -> {
                if(a.getValue().equals(b.getValue())){
                    return a.getKey().compareTo(b.getKey());
                }
                return b.getValue()-a.getValue();
            }
        );
        maxHeap.addAll(mp.entrySet());

        List<String> res = new ArrayList<>();
        while(k-- > 0){
            Map.Entry<String,Integer> entry = maxHeap.poll();
            res.add(entry.getKey());
        }

        return res;
    }
}