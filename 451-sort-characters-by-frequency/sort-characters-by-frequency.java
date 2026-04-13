class Solution {
    public String frequencySort(String s) {
        // int n = s.length;
        Map<Character, Integer> mp = new HashMap<>();
        for(char c : s.toCharArray()){
            mp.put(c, mp.getOrDefault(c, 0)+1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());

        maxHeap.addAll(mp.entrySet());
        StringBuilder sb = new StringBuilder();
        while(!maxHeap.isEmpty()){
            Map.Entry<Character,Integer> entry = maxHeap.poll();
            char key = entry.getKey();
            int val = entry.getValue();
            while(val-- > 0){
                sb.append(key);
            }
        }

        return sb.toString();
    }
}