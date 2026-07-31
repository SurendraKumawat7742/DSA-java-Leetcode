class Solution {
    public int minimumPushes(String word) {
    //1st
        int[] freq = new int[26];
        for(char c : word.toCharArray()){
            freq[c-'a']++;
        }
        Arrays.sort(freq);
        int k = 0, ans = 0;
        for(int i=25; i>=0; i--){
            if(freq[i] == 0){
                continue;
            }
            ans += freq[i]*(k/8+1);
            k++;
        }
        return ans;

    //2nd
        // Map<Character, Integer> mp = new HashMap<>();
        // for(char c : word.toCharArray()){
        //     mp.put(c, mp.getOrDefault(c,0)+1);
        // }
        // PriorityQueue<Map.Entry<Character, Integer>> pq =new PriorityQueue<>(Map.Entry.<Character, Integer>comparingByValue().reversed());
        // pq.addAll(mp.entrySet());
        // int ans = 0;
        // for(int i=0; i<mp.size(); i++){
        //     Map.Entry<Character, Integer> top = pq.peek();
        //     ans += top.getValue()*(i/8 + 1);
        //     pq.poll();
        // }
        // return ans;
    }
}