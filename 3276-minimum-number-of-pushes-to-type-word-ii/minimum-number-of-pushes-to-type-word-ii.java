class Solution {
    public int minimumPushes(String word) {
        Map<Character, Integer> mp = new HashMap<>();
        for(char c : word.toCharArray()){
            mp.put(c, mp.getOrDefault(c,0)+1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq =new PriorityQueue<>(Map.Entry.<Character, Integer>comparingByValue().reversed());
        pq.addAll(mp.entrySet());
        int ans = 0;
        for(int i=0; i<mp.size(); i++){
            Map.Entry<Character, Integer> top = pq.peek();
            ans += top.getValue()*(i/8 + 1);
            pq.poll();
        }
        return ans;
    }
}