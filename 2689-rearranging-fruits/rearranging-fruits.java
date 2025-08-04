class Solution {
    public long minCost(int[] b1, int[] b2) {
        Map<Integer, Integer> freq = new HashMap<>();
        int m = Integer.MAX_VALUE;
        for(int val : b1){
            freq.put(val, freq.getOrDefault(val,0)+1);
            m = Math.min(m, val);
        }
        for(int val : b2){
            freq.put(val, freq.getOrDefault(val,0)-1);
            m = Math.min(m, val);
        }
        List<Integer> merge = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            int cnt = entry.getValue();
            if(cnt % 2 != 0) return -1;
            for(int i=0; i<Math.abs(cnt)/2; i++){
                merge.add(entry.getKey());
            }
        }
        Collections.sort(merge);
        long ans = 0;
        for(int i=0; i<merge.size()/2; i++){
            ans += Math.min(2*m, merge.get(i));
        }
        return ans;
    }
}